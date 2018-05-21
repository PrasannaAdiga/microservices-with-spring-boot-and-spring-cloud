package com.user.api.service;

import java.util.UUID;

import com.user.api.entity.User;

public interface UserApiService {

	public User createUser(User user);
	public User getUserById(UUID id);
	public Iterable<User> getAllUsers();
	public User updateUser(User user);
	public void deleteUserById(UUID id);
	public void reserveBook(UUID userId, UUID bookId);
}
