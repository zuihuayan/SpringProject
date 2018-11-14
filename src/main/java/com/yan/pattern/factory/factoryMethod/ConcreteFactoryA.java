package com.yan.pattern.factory.factoryMethod;

public class ConcreteFactoryA extends Factory{

	@Override
	public Product factoryMethod() {
		return new ConcreteProductA();
	}

}
