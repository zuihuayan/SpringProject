package com.yan.pattern.template;

public class TemplateMethodTest {
	public static void main(String[] args) {
		Account account = new CurrentAccount();
		account.handle("zhangsan", "123456");
		
		Account account2 = new SavingAcount();
		account2.handle("zhangsan", "123456");
	}
}
