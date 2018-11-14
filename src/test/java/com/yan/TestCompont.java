package com.yan;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yan.bean.User;

public class TestCompont {

	@Test
	public void fun1() throws Exception {
		// 1��������������,����·����ȥ����xml�������ļ�
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		User u1 = (User) ac.getBean("user");
		User u3 = (User) ac.getBean("user");
		System.out.println(u1 == u3);
	}
}