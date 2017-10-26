package com.ls.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ls.bean.AuthorAutowired;

@SpringBootApplication
@RestController
//@EnableAutoConfiguration
public class SampleController {

	protected static Logger logger = LoggerFactory.getLogger(SampleController.class);

	public static void main(String[] args) {
		SpringApplication.run(SampleController.class, args);
	}

	/*
	 * 读取 properties 配置文件的属性值
	 */
	/*@Value("${book.author}")
	private String bookAuthor;
	@Value("${book.name}")
	private String bookName;*/
	
//	@Autowired
//	private AuthorAutowired author;
	
	/*@RequestMapping("/")
	String home() {
		logger.debug("访问Hello Home!");
		return "Hello World!" + "书名：" + bookName + "姓名：" + bookAuthor;
	}*/
	
//	@RequestMapping("/author")
//	String authoer() {
//		return "姓名：" + author.getName() + " 年龄：" + author.getAge();
//	}

	@RequestMapping("/hello")
	@ResponseBody
	String hello() {
		logger.info("Hello");
		return "Hello!";
	}
	
	@RequestMapping("/miniPro/loginServlet")
	@ResponseBody
	String miniPro() {
		return "username:123";
	}
	
	@RequestMapping( value = "/index")
	String index(Model model) {
		return "login";
	}
	
	@RequestMapping (value = "/regPage")
	String regPage() {
		return "reg";
	}
}
