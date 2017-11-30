package com.ls.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	/*
	 * 使用 @Bean 注解声明当前方法FunctionService() 的返回值是一个Bean，名字是方法名。
	 */
	@Bean
	public FunctionService functionService() {
		return new FunctionService();
	}
	
	/*
	 * 注入 FunctionServcie 的Bean 时候直接调用functionService()
	 */
	@Bean
	public UseFunctionService useFuncationService() {
		UseFunctionService useFunctionService = new UseFunctionService();
		useFunctionService.setFunctionService(functionService());
		return useFunctionService;
	}
	/*
	 * 另外一种注入方式，直接将 functionService 作为参数给useFunctionService(),
	 * 这也是Spring容器提供极好的功能。
	 * 在Spring容器中，只要容器中存在某个Bean，就可以在另外一个Bean的声明方法的参数中写入。
	 */
//	@Bean
//	public UseFunctionService useFunctionService(FunctionService functionService) {
//		UseFunctionService useFunctionService = new UseFunctionService();
//		useFunctionService.setFunctionService(functionService);
//		return useFunctionService;
//	}
}
