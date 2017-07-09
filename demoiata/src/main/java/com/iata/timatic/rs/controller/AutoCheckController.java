package com.iata.timatic.rs.controller;

import com.iata.timatic.rs.dto.req.PnlRequest;
import com.iata.timatic.service.FlightService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ayhanugurlu on 7/6/17.
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/autoCheck", produces = {MediaType.APPLICATION_JSON_VALUE})
public class AutoCheckController {

    public static String RESULT = "OK";

    @Autowired
    FlightService flightService;


    @ApiOperation(value = "auto check")
    @RequestMapping(value = "/check/{token}", method = RequestMethod.POST)
    public String check(@PathVariable String token){
        if(RESULT.equals("OK")){
            RESULT = "NO";
            return  RESULT;
        }else{
            RESULT = "OK";
            return  RESULT;
        }

    }

}
