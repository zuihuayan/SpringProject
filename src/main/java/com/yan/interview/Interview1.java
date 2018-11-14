package com.yan.interview;

public class Interview1 {
	public static void main(String[] args) {
		int i = 1;
		
		i = i++;
		System.out.println(i);//1
		System.out.println("------------------------");
		
		int j = i++;
		System.out.println(i);//2
		System.out.println(j);//1
		System.out.println("------------------------");
		
		int k = i + ++i * i++;
		System.out.println(i);//输出4
		System.out.println(j);//1
		System.out.println(k);//11
	}
}
