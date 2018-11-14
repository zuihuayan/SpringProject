package com.yan.pattern.proxy;

public class Proxy extends Subject {
	Subject subject = new RealSubject();

	@Override
	public void requset() {
		requestBefore();
		
		subject.requset();
		
		requestAfter();
	}
	
	private void requestBefore() {
		System.out.println("我是代理类的方法：我可以在调用真实对象 前 做一些事情，比如验证");
	}
	
	private void requestAfter() {
		System.out.println("我是代理类的方法：我可以在调用真实对象 后 做一些事情，比如对数据进行处理");
	}

}
