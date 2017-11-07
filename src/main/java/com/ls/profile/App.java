package com.ls.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// 不加载配置类
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		// 先将活动的Profile 设置为prod
		context.getEnvironment().setActiveProfiles("dev");
		// 后置注册 Bean 配置类，不然会报Bean未定义的错误
		context.register(ProfileConfig.class);
		// 刷新容器
		context.refresh();
		DemoBean demoBean = context.getBean(DemoBean.class);
		System.out.println(demoBean.getContent());
		context.close();
	}
}
