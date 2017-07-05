package com.iata.timatic.rs.controller;

import com.iata.timatic.rs.RestResponse;
import com.iata.timatic.rs.dto.LoginResponce;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ayhan Ugurlu - (ayhan.ugurlu@odc.com.tr) on 5.07.2017.
 */
@RestController
@RequestMapping(value = "/", produces = {MediaType.APPLICATION_JSON_VALUE})
public class LoginController {

    @ApiOperation(value = "Login user")
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public LoginResponce getLogin() throws Exception {
        return new LoginResponce();
    }

}
