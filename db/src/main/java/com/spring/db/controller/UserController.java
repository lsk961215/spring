package com.spring.db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.db.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/mypage")
	public String mypage() {
		
		System.out.println(userService.getUserInfo(1));
		
		
		return "user/mypage";
	}
}
