package com.ls.di;

import org.springframework.stereotype.Component;

/**
 * @Service 注解声明当前FunctionService 类是Spring 管理的一个 Bean.
 * 其中使用 @Component @Service @Repository @Controller 是等效的，可以根据需要选用。
 * @author ls
 *
 * @date 2017年10月30日下午2:59:38
 */
@Component
public class FunctionService {

	public String sayHello(String word) {
		System.out.println("FunctionService");
		return "Hello " + word + "!";
	}
}
