package com.ls.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * @Configuration 声明当前类是一个配置类
 * @ComponentScan 自动扫描包名下所有使用@Service、@Component、
 * @Repository和@Controller的类，并注册为 Bean
 */
@Configuration
@ComponentScan("com.ls.di")
public class DiConfig {

}
