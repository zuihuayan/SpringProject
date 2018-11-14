package com.yan.interview;

public class Base2 {
	private String  baseName = "base";
	
	public Base2() {
		callName();
	}
	
	public void callName() {
		System.out.println(baseName);
	}
	
	public static void main(String[] args) {
		Base2 base2 = new Base2();
	}

}
