package com.yan.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;

public class ThreadPoolTest {
	
	public static void main(String[] args) {
		
		RejectedExecutionHandler rejectedExecutionHandler;
		ExecutorService threadPool = Executors.newCachedThreadPool();
		threadPool.submit(new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		});
		
	}
	
}
