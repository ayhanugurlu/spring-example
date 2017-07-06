package com.iata.timatic.rs.controller;

import com.iata.timatic.repository.entity.User;
import com.iata.timatic.rs.dto.resp.LoginResponce;
import com.iata.timatic.rs.dto.req.LoginRequest;
import com.iata.timatic.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Ayhan Ugurlu - (ayhan.ugurlu@odc.com.tr) on 5.07.2017.
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/", produces = {MediaType.APPLICATION_JSON_VALUE})
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    UserService userService;


    @ApiOperation(value = "Login user")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public LoginResponce getLogin(@RequestBody LoginRequest loginRequest) throws Exception {
        User user = userService.login(loginRequest.getUsername(), loginRequest.getPassword());
        LoginResponce resp = new LoginResponce();
        if(user != null){
            resp.setName(user.getFullName());
        }
        return resp;
    }

}
