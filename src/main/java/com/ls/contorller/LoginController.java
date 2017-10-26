package com.ls.contorller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ls.bean.User;

@RestController
public class LoginController {

	@RequestMapping("/login")
	public String login(@RequestParam String username) {
		String result = "0";
		
        System.out.println(username);
		return result;
	}
	
	@RequestMapping("/reg")
	public String reg(@RequestBody Map<String,Object> map) {
		
		String username = map.get("username").toString();
		System.out.println(username);
		return "reg";
	}
	
	@RequestMapping("/regObj")
	public String regObj(User user) {
		String username = user.getUsername();
		System.out.println(username);
		return "0";
	}
}
