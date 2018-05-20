package com.user.rest.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.user.rest.model.RestUser;
import com.user.rest.service.UserService;

@RestController
@RequestMapping("/v1/users")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public RestUser createUser(@RequestBody RestUser user) {
		return userService.createUser(user);
	}

	@RequestMapping("/{id}")
	public RestUser getUserById(@PathVariable UUID id) {
		return userService.getUserById(id);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<RestUser> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@RequestMapping(value = "/", method = RequestMethod.PUT)
	public RestUser updateUser(@RequestBody RestUser restUser) {
		return userService.updateUser(restUser);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteUserById(@PathVariable UUID id) {
		userService.deleteUserById(id);
	}
}
