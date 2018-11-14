package com.yan.pattern.decorator;

public class ConcreteDecoratorA extends Decorator{

	public ConcreteDecoratorA(Component component) {
		super(component);
	}
	
	@Override
	public void operator() {
		super.operator();
		addDecorator();
	}
	
	private void addDecorator() {
		System.out.println("我是A装饰者，这是我要装饰的方法");
	}

}
