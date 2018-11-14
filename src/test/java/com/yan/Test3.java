package com.yan;

public class Test3 {
	public static double f(int n) {
		if(n == 1 || n == 2 || n == 3) {
			return 1;
		}
		
		double a3 = 1;
		double a2 = 2;
		double a1 = 1;
		double temp;
		for(int i = 3; i < n; i++) {
			temp = a3 + a2 + a1;
			a1 = a2;
			a2 = a3;
			a3 = temp;
		}
		
		return a3;
	}
	
	public static void main(String[] args) {
		long aa = System.currentTimeMillis();
		System.out.println(f(6));
		long bb = System.currentTimeMillis();
		
		System.out.println("------------" + (bb - aa));
	}
}

