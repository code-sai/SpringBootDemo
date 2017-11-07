package com.ls.event;

import org.springframework.context.ApplicationEvent;

public class DemoEvent extends ApplicationEvent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	
	public DemoEvent(Object source, String msg) {
		super(source);
		System.out.println("构造方法");
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void out() {
		System.out.println("调用方法");
	}
}
