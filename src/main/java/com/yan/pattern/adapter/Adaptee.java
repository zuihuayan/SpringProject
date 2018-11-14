package com.yan.pattern.adapter;

//公开接口的具体实现者(比如oracle公司提供的)
public class Adaptee {
	public void concreMethod() {
		System.out.println("比如这是oracle厂商提供的jdbc实现");
	}
}
