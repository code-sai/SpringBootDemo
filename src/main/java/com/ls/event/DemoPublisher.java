package com.ls.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {

	@Autowired
	ApplicationContext applicationContext;
	
	public void publish(String msg) {
		System.out.println("发布事件");
		applicationContext.publishEvent(new DemoEvent(this, msg));
	}
}
