package com.user.api.serviceImpl;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.api.entity.User;
import com.user.api.repository.UserRepository;
import com.user.api.service.UserApiService;

@Service
public class UserApiServiceImpl implements UserApiService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserApiServiceImpl.class);

	@Autowired
	UserRepository userRepository;

	@Override
	public User createUser(User user) {
		if(user.getId() != null) {
			User existingUser = userRepository.findOne(user.getId());
			if(existingUser != null) {
				logger.error("The user with first name {} already exists", user.getFirstName());
			}
		}
		
		return userRepository.save(user);
	}

	@Override
	public User getUserById(UUID id) {
		return userRepository.findOne(id)
;	}

	@Override
	public Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUserById(UUID id) {
		userRepository.delete(id);
	}
	
}
