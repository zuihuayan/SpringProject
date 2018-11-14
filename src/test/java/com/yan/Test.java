package com.yan;

public class Test {
	public static double f(int n) {
		if(n == 1) {
			return 5;
		}
		
		return f(n-1) + 7;
	}
	
	public static void main(String[] args) {
		long aa = System.currentTimeMillis();
		System.out.println(f(50000));
		long bb = System.currentTimeMillis();
		
		System.out.println(bb - aa);
	}
}
