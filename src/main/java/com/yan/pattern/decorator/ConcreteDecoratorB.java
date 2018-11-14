package com.yan.pattern.decorator;

public class ConcreteDecoratorB extends Decorator{

	public ConcreteDecoratorB(Component component) {
		super(component);
	}
	
	@Override
	public void operator() {
		super.operator();
		addDecorator();
	}

	private void addDecorator() {
		System.out.println("我是B装饰者，这是我要装饰的方法");
	}
}
