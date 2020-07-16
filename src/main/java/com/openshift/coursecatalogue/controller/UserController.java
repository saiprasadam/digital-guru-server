package com.openshift.coursecatalogue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.openshift.coursecatalogue.model.Users;
import com.openshift.coursecatalogue.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService usersService;
	
	@RequestMapping("/getUser")
	public Users getUserName(@RequestParam String name) {
		Users users = usersService.getByName(name);
		return users;
	}
}
