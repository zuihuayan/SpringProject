package com.yan.pattern.observer.define;

public class Client {
	public static void main(String[] args) {
		
		ConcreteSubject  observable = new ConcreteSubject();//能被观察的
		
		Observer observer = new CatObserver();//观察者
		observable.addLisener(observer);
		
		Observer observer2 = new DogObserver();
		observable.addLisener(observer2);
		
		observable.setMessage("我是能被观察的  消息");
		
		System.out.println("---------------------");
		
		observable.removeLisener(observer);
		
		observable.setMessage("我又更新了新消息");
		
	}
}
