package com.ls.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Java 配置Spring
 * @author ls
 *
 * @date 2017年10月30日下午4:00:20
 */
public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
		System.out.println(useFunctionService.sayHello("Java Config"));
		context.close();
	}
}
