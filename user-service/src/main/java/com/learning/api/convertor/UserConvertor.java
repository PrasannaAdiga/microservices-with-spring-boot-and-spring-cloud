package com.learning.api.convertor;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.learning.api.entity.Role;
import com.learning.api.entity.User;
import com.learning.api.entity.UserRole;
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
		
		Role defaultUserRole = new Role();
		defaultUserRole.setRoleId(1);
		defaultUserRole.setRoleName("ROLE_USER");
		
		Set<UserRole> userRoles = new HashSet<>();
		userRoles.add(new UserRole(user, defaultUserRole));
		
		user.setUserRoles(userRoles);
		
		return user;
		
	}
}
