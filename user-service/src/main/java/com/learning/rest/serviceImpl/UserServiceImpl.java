package com.learning.rest.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.learning.api.convertor.UserConvertor;
import com.learning.api.entity.User;
import com.learning.rest.model.RestUser;
import com.learning.rest.service.UserService;
import com.learning.api.service.UserApiService;

public class UserServiceImpl implements UserService {

	@Autowired
	UserConvertor userConvertor;

	@Autowired
	UserApiService userApiService;

	@Override
	public User createUser(RestUser restUser) {
		User user = userConvertor.convertToEntity(restUser);
		return userApiService.createUser(user);
	}
	
}
