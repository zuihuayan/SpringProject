package com.yan.pattern.factory.factoryMethod;

public abstract class Product {
	public void methodSame() {
		System.out.println("��������");
	}
	
	protected abstract void methodDiff();
}
