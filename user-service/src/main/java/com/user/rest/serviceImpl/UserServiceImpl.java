package com.user.rest.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
	public RestUser createUser(RestUser restUser) {
		User user = userApiService.createUser(userConvertor.convertToEntity(restUser));
		return userConvertor.convertToRest(user);
	}

	@Override
	public RestUser getUserById(UUID id) {
		User user = userApiService.getUserById(id);
		return userConvertor.convertToRest(user);
	}

	@Override
	public List<RestUser> getAllUsers() {
		List<RestUser> restUsers = new ArrayList<>();
		Iterable<User> users = userApiService.getAllUsers();
		users.forEach(user -> {
			restUsers.add(userConvertor.convertToRest(user));
		});
		return restUsers;
	}

	@Override
	public RestUser updateUser(RestUser restUser) {
		User user = userApiService.updateUser(userConvertor.convertToEntity(restUser));
		return userConvertor.convertToRest(user);
	}

	@Override
	public void deleteUserById(UUID id) {
		userApiService.deleteUserById(id);
	}
	
}
