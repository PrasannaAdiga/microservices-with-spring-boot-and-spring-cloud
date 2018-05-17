package com.learning.user;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.learning.api.convertor.UserConvertor;
import com.learning.api.entity.User;
import com.learning.rest.model.RestUser;
import com.learning.rest.service.UserService;

@SpringBootApplication
@ComponentScan(basePackages = "com.learning.*")
@EntityScan(basePackages = "com.learning.api.entity")
@EnableJpaRepositories("com.learning.api.repository")
public class UserServiceApplication implements CommandLineRunner {

	@Autowired
	UserService userService;
	
	@Autowired
    UserConvertor userConvertor;

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
