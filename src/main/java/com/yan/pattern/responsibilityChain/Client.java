package com.yan.pattern.responsibilityChain;

public class Client {
	public static void main(String[] args) {
		Handler handler = new ConcreteHandlerA();
		Handler handler2 = new ConcreteHandlerB();
		Handler handler3 = new LastConcreteHandlerC();
		
		handler.setHandler(handler2);
		handler2.setHandler(handler3);
		handler.handleRequest();

//		下面是测试方式，可以都试试，看看效果
//		handler.setHandler(handler3);
//		handler3.setHandler(handler2);
//		handler.handleRequest();
		
//		handler2.setHandler(handler);
//		handler.setHandler(handler3);
//		handler2.handleRequest();
		
	}
}
