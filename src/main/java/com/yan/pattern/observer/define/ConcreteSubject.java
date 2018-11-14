package com.yan.pattern.observer.define;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{
	List<Observer> lists = new ArrayList<Observer>();
	
	public void addLisener(Observer o) {
		lists.add(o);
	}
	
	public void removeLisener(Observer o) {
		lists.remove(o);
	}
	
	private String message;
	
	public void setMessage(String message) {
		this.message = message;
		notiseObservers();
	}
	
	public void notiseObservers() {
		for(Observer observer : lists) {
			observer.showMessage(message);
		}
	}
}
