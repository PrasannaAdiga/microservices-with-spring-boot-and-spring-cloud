package com.user.api.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.user.api.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, UUID> {
	
}
