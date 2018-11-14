package com.yan.pattern.strategy;

public class Context {
	Strategy strategy;
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void algorithm() {
		System.out.println("׼����ʼ����");
		strategy.algorithm();
		System.out.println("�������");
	}
}
