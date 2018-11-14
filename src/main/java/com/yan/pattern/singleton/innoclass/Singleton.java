package com.yan.pattern.singleton.innoclass;

public class Singleton {
	private Singleton() {//私有构造器防止 直接new
		
	}
	
	private static class HolderClass {
		private static final Singleton instance = new Singleton();
	}
	
	public static Singleton getInstance() {
		return HolderClass.instance;
	}
	
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();

		Singleton instance2 = Singleton.getInstance();

		System.out.println(instance == instance2);
	}
}
