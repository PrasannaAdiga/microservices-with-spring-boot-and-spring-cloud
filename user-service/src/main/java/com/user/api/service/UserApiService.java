package com.user.api.service;

import com.user.api.entity.User;

public interface UserApiService {

	public User getUserByName(String userName);
	public User createUser(User user);
}
