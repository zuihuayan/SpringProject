package com.yan.interview;

public class Son extends Father{
	static {
		System.out.println("子类--静态初始化块");
	}
	
	public Son() {
		System.out.println("子类---构造器");
	}
	
	{
		System.out.println("子类---普通初始化块");
	}
	
	public static void main(String[] args) {
		new Son();
	}
}
