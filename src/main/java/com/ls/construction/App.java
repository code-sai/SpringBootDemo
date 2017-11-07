package com.ls.construction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
		context.getBean(BeanWayService.class);
		context.getBean(JSR250WayService.class);
		context.close();
	}
}
