package com.yan.pattern.template;

public class CurrentAccount extends Account{

	@Override
	public void calculateInterest(String account, String password) {
		balance = 2000;
		interest = 0.1;
		System.out.println("活动账户余额：" + balance);
		System.out.println("活动账户利息：" + interest);
	}
	
}
