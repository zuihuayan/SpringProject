package com.yan.pattern.responsibilityChain;

public class ConcreteHandlerA extends Handler{
	
	@Override
	public void handleRequest() {
		System.out.println("传递到了A中");
		
		this.next.handleRequest();
	}

}
