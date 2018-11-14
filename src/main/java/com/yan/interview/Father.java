package com.yan.interview;

public class Father {
	static {
		System.out.println("父类---静态初始化块");
	}
	
	public Father() {
		System.out.println("父类---构造器");
	}
	
	{
		System.out.println("父类---普通初始化块");
	}

	public static void main(String[] args) {
		
		new Father();
	}

}
