package com.learning.rest.service;

import com.learning.api.entity.User;
import com.learning.rest.model.RestUser;

public interface UserService {
	
	public User createUser(RestUser user);
}
