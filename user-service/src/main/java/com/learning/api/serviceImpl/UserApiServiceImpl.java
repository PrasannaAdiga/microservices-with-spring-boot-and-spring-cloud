package com.learning.api.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.api.entity.User;
import com.learning.api.repository.UserRepository;
import com.learning.api.service.UserApiService;

@Service
public class UserApiServiceImpl implements UserApiService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserApiServiceImpl.class);

	@Autowired
	UserRepository userRepository;

	@Override
	public User createUser(User user) {
		User existingUser = userRepository.findByFirstName(user.getFirstName());
		
		if(existingUser != null) {
			logger.error("The user with first name {} already exists", user.getFirstName());
		}
		return userRepository.save(user);
	}

	@Override
	public User getUserByName(String userName) {
		return userRepository.findByFirstName(userName);
	}
	
}
