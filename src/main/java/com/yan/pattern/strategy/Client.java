package com.yan.pattern.strategy;

class Client {

	public static void main(String args[]) {

		Context context = new Context();
		
		//����A
		Strategy strategy = new ConcreteStrategyA();
		context.setStrategy(strategy);
		context.algorithm();
		
		//����B
//		Strategy strategy = new ConcreteStrategyB();
//		context.setStrategy(strategy);
//		context.algorithm();
	}

}

