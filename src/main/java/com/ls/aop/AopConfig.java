package com.ls.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.ls.aop")
// 使用@EnableAspectJAutoProxy注解开启Spring对AspectJ代理的支持
@EnableAspectJAutoProxy
public class AopConfig {

}
