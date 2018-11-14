package com.yan.pattern.proxy;

public class RealSubject extends Subject{

	@Override
	public void requset() {
		System.out.println("真正请求的地方");
		
	}

}
