package com.learning.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learning.api.entity.User;
import com.learning.rest.model.RestUser;
import com.learning.rest.service.UserService;

@RestController
@RequestMapping("/v1/users")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/{userName}")
	public String getUserByName(@PathVariable String userName) {
		return "Prasanna";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public User createUser(@RequestBody RestUser user) {
		return userService.createUser(user);
	}

}
