package com.yan.pattern.observer.jdk;

import java.util.Observer;

public class Client {
	public static void main(String[] args) {
		MyObservable observable = new MyObservable();
		
		Observer firstObserver = new FirstObserver();
		observable.addObserver(firstObserver);
		
		Observer secondObserver = new SecondObserver();
		observable.addObserver(secondObserver);
		
		observable.setChanged();
		observable.notifyObservers("你好");
	}
}
