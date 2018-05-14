package com.learning.api.convertor;

import org.springframework.stereotype.Component;

import com.learning.api.entity.User;
import com.learning.rest.model.RestUser;

@Component
public class UserConvertor {

	public RestUser convertToRest(User user) {
		RestUser restUser = new RestUser();
		
		restUser.setFirstName(user.getFirstName());
		restUser.setLastName(user.getLastName());
		restUser.setUsername(user.getUsername());
		restUser.setEmail(user.getEmail());
		restUser.setJoinDate(user.getJoinDate());
		
		return restUser;
	}
	
	public User convertToEntity(RestUser restUser) {
		User user = new User();
		
		user.setFirstName(restUser.getFirstName());
		user.setLastName(restUser.getLastName());
		user.setEmail(restUser.getEmail());
		user.setUsername(restUser.getUsername());
		user.setJoinDate(restUser.getJoinDate());
		user.setPassword(restUser.getPassword());
		
		return user;
		
	}
}
