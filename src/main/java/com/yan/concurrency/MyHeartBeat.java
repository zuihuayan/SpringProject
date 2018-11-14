package com.yan.concurrency;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

public class MyHeartBeat {
	
	public static void main(String[] args) {
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
		
		Callable<String> myTask2 = new MyTask2();
		Future<String> future = scheduledExecutorService.submit(myTask2);
		try {
			String result = future.get();
			System.out.println(result);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
	}
	
	static class MyTask implements Runnable{

		public void run() {
			System.out.println(new Date());
			
		}
		
	}
	
	static class MyTask2 implements Callable<String> {

		public String call() throws Exception {
			System.out.println(1111);
			return "2222";
		}
		
	}
	
}
