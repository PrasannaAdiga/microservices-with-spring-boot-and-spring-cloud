package com.learning.rest.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.api.convertor.UserConvertor;
import com.learning.api.entity.User;
import com.learning.api.service.UserApiService;
import com.learning.rest.model.RestUser;
import com.learning.rest.service.UserService;

@Service
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

	@Override
	public RestUser getUserByName(String userName) {
		User user = userApiService.getUserByName(userName);
		return userConvertor.convertToRest(user);
	}
	
}
