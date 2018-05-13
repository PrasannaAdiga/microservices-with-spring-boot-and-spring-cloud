package com.learning.api.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.api.entity.User;
import com.learning.api.repository.UserRepository;
import com.learning.api.service.UserApiService;

@Service
public class UserApiServiceImpl implements UserApiService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}
	
}
