package com.learning.api.service;

import com.learning.api.entity.User;

public interface UserApiService {

	public User getUserByName(String userName);
	public User createUser(User user);
}
