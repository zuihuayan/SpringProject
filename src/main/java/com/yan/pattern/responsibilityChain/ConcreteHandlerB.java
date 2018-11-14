package com.yan.pattern.responsibilityChain;

public class ConcreteHandlerB extends Handler{

	@Override
	public void handleRequest() {
		System.out.println("传递到了B中");
		this.next.handleRequest();
	}

}
