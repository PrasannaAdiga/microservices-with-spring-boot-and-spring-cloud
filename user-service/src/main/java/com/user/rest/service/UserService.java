package com.user.rest.service;

import com.user.api.entity.User;
import com.user.rest.model.RestUser;

public interface UserService {
	
	public RestUser getUserByName(String userName);
	public User createUser(RestUser user);
}
