package com.yan.pattern.builder;

public class ConcreteBuilder extends Builder{
	
	public void builderA(String a) {
		product.setA(a);
		
	}

	public void builderB(int b) {
		product.setB(b);
		
	}

	public void builderC(Object c) {
		product.setC(c);
		
	}
	
	//具体构建方式
	public Product builder() {
		builderA("12");
		builderB(34);
		builderC("56");
		
		return product;
	}

}
