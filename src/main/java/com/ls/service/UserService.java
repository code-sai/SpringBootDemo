package com.ls.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ls.bean.User;
import com.ls.mapper.UserMapper;

@Service
public class UserService {

	@Autowired
	private UserMapper mapper;
	
	public List<User> getAllUser() {
		List<User> list = new ArrayList<User>();
		list = mapper.selectAll();
		for (User u:list) {
			System.out.println(u.getUsername());
		}
		return list;
	}
}
