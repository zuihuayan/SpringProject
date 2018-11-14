package com.yan.pattern.observer.jdk;

import java.util.Observable;

public class MyObservable extends Observable{
	
	public void setChanged() {
       super.setChanged();
    }
}
