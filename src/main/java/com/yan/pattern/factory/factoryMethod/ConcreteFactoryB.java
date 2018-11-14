package com.yan.pattern.factory.factoryMethod;

public class ConcreteFactoryB extends Factory{

	@Override
	public Product factoryMethod() {
		return new ConcreteProductB();
	}

}
