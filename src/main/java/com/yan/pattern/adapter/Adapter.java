package com.yan.pattern.adapter;

//适配器类，必须实现或者继承目标抽象类(比如jdk提供的接口)
public class Adapter extends Target{
	Adaptee adaptee;//持有具体实现者(比如oracle公司提供)的引用
	
	public Adapter(Adaptee adaptee) {
		this.adaptee=adaptee;
	}

	@Override
	public void pubMethod() {
		adaptee.concreMethod();
		
	}
	
}
