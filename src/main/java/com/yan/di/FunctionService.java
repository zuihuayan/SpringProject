package com.yan.di;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {
	public String doSomeThing() {
		String result = "这是我的service";
		return result;
		
	}
}
