package com.example.demo.services;


import java.util.List;

import com.example.demo.entities.User;


public interface UserService {
    
    /*
     * since UserRepository is a interface so spring will not make direct obj of it instead 
     * a implemenation of class of UserRepository will created and then its obj will made.  
     */
    

    User saveUser(User user);

    User updateUser(User user, int userId);

    void deleteUser(int userId);

    List<User> getAllUser();

    User getUser(int userId);
}
