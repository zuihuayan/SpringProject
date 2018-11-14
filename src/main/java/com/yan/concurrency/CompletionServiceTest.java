package com.yan.concurrency;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletionServiceTest {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		
		CompletionService<String> completionService = new ExecutorCompletionService<String>(executor);
		
		for (int i = 0; i < 10; i++) {
			final String result = String.valueOf(i);
			completionService.submit(new Callable<String>() {
				
				public String call() throws Exception {
					Thread.sleep(new Random().nextInt(5000));
					return result;
				}
			});
		}
		
		System.out.println(completionService.take().get());
	}
	
}
