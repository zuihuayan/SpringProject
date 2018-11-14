package com.yan.pattern.template;

public abstract class Account {
	protected double balance;
	protected double interest;
	
	public void handle(String account, String password) {
		if(!valid(account, password)) {
			System.out.println("�û����������벻��ȷ");
			return;
		}
		display(account, password);
		calculateInterest(account, password);
	}
	
	private boolean valid(String account, String password) {
		if("zhangsan".equals(account) && "123456".equals(password)) {
			return true;
		}
		return false;
	}
	
	public void display(String account, String password) {
		System.out.println("--------------------------------");
		System.out.println("��ʾ�˺�");
	}
	
	public abstract void calculateInterest(String account, String password);
}
