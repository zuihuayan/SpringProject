package com.yan.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseFunctionService {
	@Autowired
	FunctionService functionService;
	
	public String doSomeThing() {
		System.out.println("ʹ��ǰ�Ĳ���");
		
		String result = functionService.doSomeThing();
		System.out.println("result:" + result);
		
		System.out.println("ʹ�ú�Ĳ���");
		return result;
	}
}
