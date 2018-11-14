package com.yan.pattern.observer.define;

public class DogObserver extends Observer{
	public void showMessage(String message) {
		System.out.println("我是狗观察者，我接收了:" + message);
	}
}
