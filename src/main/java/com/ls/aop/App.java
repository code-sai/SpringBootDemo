 package com.ls.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// Spring 容器
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		// bean
		DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
		DemoMethodService demoMenthodService = context.getBean(DemoMethodService.class);
		demoAnnotationService.add();
		
		demoMenthodService.add();
		context.close();
	}
}
