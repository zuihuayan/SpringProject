package com.yan.pattern.builder;

public abstract class Builder {
	protected Product product = new Product();
	
	public abstract void builderA(String a);
	public abstract void builderB(int b);
	public abstract void builderC(Object c);
	
	public abstract Product builder();
}
