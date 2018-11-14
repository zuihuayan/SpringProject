package com.yan.pattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class FirstObserver implements Observer{

	public void update(Observable o, Object arg) {
		System.out.println("我是第一个观察者，我收到了" + arg);
		
	}

}
