package com.ls.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ls.bean.User;
import com.ls.service.UserService;

@RestController
public class MyBatisDemo {

	@Autowired
	private UserService service;

	@RequestMapping("/getAll")
	public String getAllUser() {
		List<User> list = service.getAllUser();
		return list.toString();
	}
}
