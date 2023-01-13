package com.example.demo;

//import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.User;
import com.example.demo.services.UserService;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	private Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// User user = new User();
		// user.setName("ANANT");
		// user.setCity("Delhi");
		// user.setAge(34);
		// User savedUser = userService.saveUser(user);
		// System.out.println(savedUser); 

		//get single user
		
		// List<User>users =	userService.getAllUser();
		// logger.info("user size ids  {}",users.size());
		// logger.info("usera : {} ", users);

	    //  User user =userService.getUser(3);
         
		//  logger.info("user is{} ",user);

		User user = new User();
		user.setName("Varun");
		user.setAge(30);
		user.setCity("Kanpur");

		User updatedUser = userService.updateUser(user,7);
		logger.info("updated user details : {} ",updatedUser);
	}

}
