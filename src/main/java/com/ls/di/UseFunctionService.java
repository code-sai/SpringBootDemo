package com.ls.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseFunctionService {

	/* 使用 @Autowired 将 FunctionService 的实体 Bean 注入到 UseFunctionService 中，
	 * 让 UseFunctionService 具备FunctionService 的功能
	 */ 
	@Autowired
	FunctionService functionService;
	
	public String sayHello(String word) {
		System.out.println("UseFunctionService");
		return functionService.sayHello(word);
	}
}
