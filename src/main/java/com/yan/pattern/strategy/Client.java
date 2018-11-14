package com.yan.pattern.strategy;

class Client {

	public static void main(String args[]) {

		Context context = new Context();
		
		//²ßÂÔA
		Strategy strategy = new ConcreteStrategyA();
		context.setStrategy(strategy);
		context.algorithm();
		
		//²ßÂÔB
//		Strategy strategy = new ConcreteStrategyB();
//		context.setStrategy(strategy);
//		context.algorithm();
	}

}

