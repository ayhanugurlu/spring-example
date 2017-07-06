package com.iata.timatic.service;

import com.iata.timatic.repository.UserRepository;
import com.iata.timatic.repository.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ayhan Ugurlu - (ayhan.ugurlu@odc.com.tr) on 6.07.2017.
 */

@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    UserRepository userRepository;




    @Override
    public User login(String userName, String password) {
        return userRepository.findByUsernameAndPassword(userName,password);
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }
}
