package com.yan.pattern.responsibilityChain;

public class LastConcreteHandlerC extends Handler{

	@Override
	public void handleRequest() {
		System.out.println("传递到了C中，C为最后一个");
		
	}

}
