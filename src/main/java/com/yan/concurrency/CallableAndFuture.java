package com.yan.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Future<String> submit = executor.submit(new Callable<String>() {

			public String call() throws Exception {
				System.out.println("调用了");
				return "返回结果";
			}
		});
		
		submit.cancel(true);
		System.out.println("----------");
		String result = submit.get();
		System.out.println(result);
		
		
		
		System.out.println(executor.isShutdown());
		executor.shutdown();
		System.out.println(executor.isShutdown());
		
	}
	
}
