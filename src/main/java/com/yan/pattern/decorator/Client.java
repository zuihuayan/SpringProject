package com.yan.pattern.decorator;

public class Client {
	public static void main(String[] args) {
		Component component = new ConcreteComponent();

		component = new ConcreteDecoratorA(component);
		component.operator();

		System.out.println("-----------------------------");

		component = new ConcreteDecoratorB(component);
		component.operator();
	}
}
