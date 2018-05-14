package com.learning.user;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.learning.api.convertor.UserConvertor;
import com.learning.api.entity.Role;
import com.learning.api.entity.User;
import com.learning.api.entity.UserRole;
import com.learning.rest.model.RestUser;
import com.learning.rest.service.UserService;

@SpringBootApplication
@ComponentScan(basePackages = "com.learning.*")
@EntityScan(basePackages = "com.learning.api.entity")
@EnableJpaRepositories("com.learning.api.repository")
public class UserServiceApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
	
	@Autowired
	private UserConvertor userConvertor;

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setFirstName("Prasanna");
		user.setLastName("Adiga");
		user.setPassword("Password");
		user.setUsername("Prasanna Adiga");
		user.setEmail("gpadiga@gmail.com");
		user.setJoinDate(new Date());
		
		RestUser restUser = userConvertor.convertToRest(user);
		userService.createUser(restUser);
	}
}
