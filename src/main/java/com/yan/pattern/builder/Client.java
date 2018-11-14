package com.yan.pattern.builder;

public class Client {
	public static void main(String[] args) {
		Builder builder = new ConcreteBuilder();
		Product product = builder.builder();
		
		System.out.println(product);
	}
}
