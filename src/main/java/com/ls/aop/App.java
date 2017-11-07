 package com.ls.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
		DemoMethodService demoMenthodService = context.getBean(DemoMethodService.class);
		demoAnnotationService.add();
		
		demoMenthodService.add();
		context.close();
	}
}
