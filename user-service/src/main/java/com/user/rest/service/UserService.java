package com.user.rest.service;

import java.util.List;
import java.util.UUID;

import com.user.rest.model.RestUser;

public interface UserService {
	
	public RestUser getUserById(UUID id);
	public RestUser createUser(RestUser restUser);
	public List<RestUser> getAllUsers();
	public RestUser updateUser(RestUser restUser);
	public void deleteUserById(UUID id);
}
