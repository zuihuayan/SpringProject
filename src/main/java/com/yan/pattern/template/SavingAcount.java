package com.yan.pattern.template;

public class SavingAcount extends Account{

	@Override
	public void calculateInterest(String account, String password) {
		balance = 1000;
		interest = 0.15;
		System.out.println("�����˻���" + balance);
		System.out.println("�����˻���Ϣ��" + interest);
	}

}
