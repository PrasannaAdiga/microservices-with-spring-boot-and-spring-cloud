package com.learning.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learning.api.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
