package com.yan.pattern.singleton.ehan;

public class Singleton {
	private static Singleton instance = new Singleton();
	
	private Singleton() {//私有构造器防止 直接new
		
	}
	
	public static Singleton getInstance() {
		return instance;
	}
	
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		
		Singleton instance2 = Singleton.getInstance();
		
		System.out.println(instance == instance2);
	}

}
