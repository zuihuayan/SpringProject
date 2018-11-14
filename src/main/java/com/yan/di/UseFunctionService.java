package com.yan.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseFunctionService {
	@Autowired
	FunctionService functionService;
	
	public String doSomeThing() {
		System.out.println("使用前的操作");
		
		String result = functionService.doSomeThing();
		System.out.println("result:" + result);
		
		System.out.println("使用后的操作");
		return result;
	}
}
