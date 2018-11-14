package com.yan.pattern.factory.factoryMethod;

public class Client {
	public static void main(String[] args) {
		Factory factory = new ConcreteFactoryB();
		Product product = factory.factoryMethod();
		product.methodSame();
		product.methodDiff();
	}
}
