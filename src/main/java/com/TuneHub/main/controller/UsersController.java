package com.TuneHub.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.TuneHub.main.entity.Users;
import com.TuneHub.main.services.UsersServices;

@Controller
public class UsersController {
	@Autowired
	UsersServices service;
@PostMapping("/register")
	public String addUsers(@ModelAttribute Users user)
{
	service.addUsers(user);
	
	return "home";
		
}
}
