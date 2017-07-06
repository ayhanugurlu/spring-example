package com.iata.timatic;

import com.iata.timatic.repository.UserRepository;
import com.iata.timatic.repository.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

/**
 * Created by Ayhan Ugurlu - (ayhan.ugurlu@odc.com.tr) on 5.07.2017.
 */
@SpringBootApplication
public class Application {

    @Autowired
    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @PostConstruct
    public void init(){
        User user =  new User();
        user.setFullName("ayhan ugurlu");
        user.setPassword("password");
        user.setUsername("ayhanugurlu");
        userRepository.save(user);
    }
}
