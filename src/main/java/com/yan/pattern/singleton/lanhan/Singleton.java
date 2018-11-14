package com.yan.pattern.singleton.lanhan;

public class Singleton {
	// 注意有volatile
	private volatile static Singleton instance = null;

	private Singleton() {// 私有构造器防止 直接new

	}

	public static Singleton getInstance() {
		// 双重锁------双重检查锁定(Double-Check Locking)
		if (instance == null) {
			synchronized (Singleton.class) {// 同步操作,防止多次创建
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}

		return instance;
	}

	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();

		Singleton instance2 = Singleton.getInstance();

		System.out.println(instance == instance2);
	}
}
