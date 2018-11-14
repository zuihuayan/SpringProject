package com.yan;

public class Test2 {
	public static double f(int n) {
		double a1 = 7;
		double sum = 5;
		for(int i = 2; i <= n; i++) {
			sum = sum + a1;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		long aa = System.currentTimeMillis();
		System.out.println(f(5000000));
		long bb = System.currentTimeMillis();
		
		System.out.println(bb - aa);
	}
}
