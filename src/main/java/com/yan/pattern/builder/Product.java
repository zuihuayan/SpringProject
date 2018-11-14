package com.yan.pattern.builder;

public class Product {
	private String a;
	private int b;
	private Object c;
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public Object getC() {
		return c;
	}
	public void setC(Object c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Product [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
}
