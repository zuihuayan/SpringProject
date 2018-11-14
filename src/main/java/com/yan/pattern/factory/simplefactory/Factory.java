package com.yan.pattern.factory.simplefactory;

public class Factory {
	public static Product factoryMethod(String type) {
		if ("A".equalsIgnoreCase(type)) {
			return new ConcreteProductA();
		}

		if ("B".equalsIgnoreCase(type)) {
			return new ConcreteProductB();
		}

		return null;
	}
}
