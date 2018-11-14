package com.yan.pattern.factory.simplefactory;

public abstract class Product {
	public void methodSame() {
		System.out.println("公共方法");
	}
	
	protected abstract void methodDiff();
}
