package com.yan.pattern.template;

public class CurrentAccount extends Account{

	@Override
	public void calculateInterest(String account, String password) {
		balance = 2000;
		interest = 0.1;
		System.out.println("��˻���" + balance);
		System.out.println("��˻���Ϣ��" + interest);
	}
	
}
