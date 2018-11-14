package com.yan.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

public class LifecycleExecutorService {
	
//	private final ExecutorService exec = ;
	
	public void start() {
		Callable<String> callable = Executors.privilegedCallable(new MyTask());
		String result;
		try {
			result = callable.call();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void stop() {
//		exec.shutdown();
	}
	
	static class MyTask implements Callable<String> {

		public String call() throws Exception {
			System.out.println("调用了");
			return "返回结果";
		}
		
	}
	
}
