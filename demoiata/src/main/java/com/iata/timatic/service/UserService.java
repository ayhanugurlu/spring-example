package com.iata.timatic.service;

import com.iata.timatic.repository.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ayhan Ugurlu - (ayhan.ugurlu@odc.com.tr) on 6.07.2017.
 */

public interface UserService {

    User login(String userName,String password);

    User addUser(User user);

}
