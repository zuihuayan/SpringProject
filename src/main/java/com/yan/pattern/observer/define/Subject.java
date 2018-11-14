package com.yan.pattern.observer.define;

public interface Subject {
	public void addLisener(Observer o);
	
	public void removeLisener(Observer o);
	
	public void notiseObservers();
}
