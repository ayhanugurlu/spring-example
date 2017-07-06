package com.iata.timatic.rs.controller;

import com.iata.timatic.rs.dto.resp.LoginResponce;
import com.iata.timatic.rs.dto.req.LoginRequest;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Ayhan Ugurlu - (ayhan.ugurlu@odc.com.tr) on 5.07.2017.
 */
@RestController
@RequestMapping(value = "/", produces = {MediaType.APPLICATION_JSON_VALUE})
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(LoginController.class);

    @ApiOperation(value = "Login user")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public LoginResponce getLogin(@RequestBody LoginRequest loginRequest
    ) throws Exception {
        return new LoginResponce();
    }

}
