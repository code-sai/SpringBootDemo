package com.ls.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		/*
		 * 使用 AnnotationConfigApplicationContext 作为 Spring 容器，接受一个配置类作为参数
		 */
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
		System.out.println(useFunctionService.sayHello("di"));
		context.close();
	}
}
