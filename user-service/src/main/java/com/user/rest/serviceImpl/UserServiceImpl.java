package com.user.rest.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.api.entity.User;
import com.user.api.service.UserApiService;
import com.user.rest.convertor.UserConvertor;
import com.user.rest.model.RestUser;
import com.user.rest.service.UserService;

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
