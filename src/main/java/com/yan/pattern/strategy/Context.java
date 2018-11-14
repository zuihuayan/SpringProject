package com.yan.pattern.strategy;

public class Context {
	Strategy strategy;
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void algorithm() {
		System.out.println("准备开始计算");
		strategy.algorithm();
		System.out.println("计算结束");
	}
}
