package com.example.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.services.UserService;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserRepository userRepository;

    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public User saveUser(User user) {
      User savedUser =  userRepository.save(user);
      logger.info("User_saved :{}", savedUser.getId());
        return savedUser;
    }
   

    @Override
/*
 * User will have  new data from 'user' with 'userId'
 */
    public User updateUser(User user, int userId) {
      // 1. get User from database
     User user1=  userRepository.findById(userId).orElseThrow(() -> new RuntimeException("user Id is not applicable"));
      user1.setName((user.getName()));
      user1.setCity(user.getCity());
      user1.setAge(user.getAge());

      // 2. then update user
      User user2 = userRepository.save(user1);

        return user2;
    }

    @Override
    public void deleteUser(int userId) {
      
        
    }
// to get the all user
    @Override
    public List<User> getAllUser() {
     List<User> users = userRepository.findAll();  
        return users;
    }

    //get single user with given ID

    @Override
    public User getUser(int userId) {
       Optional<User> userOptional = userRepository.findById(userId);
      User user=  userOptional.orElseThrow(() -> new RuntimeException("User with given Id not found"));
       // userOptional.orElseThrow(() ->)
        return user;
    }

    

}
