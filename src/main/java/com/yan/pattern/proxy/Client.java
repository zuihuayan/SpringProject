package com.yan.pattern.proxy;

public class Client {
	public static void main(String[] args) {
		Subject subject = new Proxy();
		subject.requset();
	}
}
