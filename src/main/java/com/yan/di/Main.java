package com.yan.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DiConfig.class);
		
		UseFunctionService useFunctionService = ac.getBean(UseFunctionService.class);
		
		useFunctionService.doSomeThing();
		
	}
	
	
}
