package com.yan.pattern.facade;

public class Facade {
	SubSystemA subSystemA = new SubSystemA();
	SubSystemB subSystemB = new SubSystemB();
	SubSystemC subSystemC = new SubSystemC();
	
	public void drinkTea() {
		subSystemA.methodA();
		subSystemB.methodB();
		subSystemC.methodC();
	}
}
