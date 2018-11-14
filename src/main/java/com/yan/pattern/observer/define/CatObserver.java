package com.yan.pattern.observer.define;

public class CatObserver extends Observer{

	public void showMessage(String message) {
		System.out.println("我是猫观察者，我接收了:" + message);
	}

}
