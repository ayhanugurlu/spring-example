package com.iata.timatic.rs.controller;

import com.iata.timatic.rs.dto.req.LoginRequest;
import com.iata.timatic.rs.dto.req.PnlRequest;
import com.iata.timatic.rs.dto.resp.PnlResponce;
import com.iata.timatic.service.FlightService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ayhanugurlu on 7/6/17.
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/pnl", produces = {MediaType.APPLICATION_JSON_VALUE})
public class PnlController {

    @Autowired
    FlightService flightService;


    @ApiOperation(value = "pnl check")
    @RequestMapping(value = "/check/{token}", method = RequestMethod.POST)
    public PnlResponce check(@RequestBody PnlRequest pnlRequest, @PathVariable String token){
        PnlResponce  result = new PnlResponce();
        if(pnlRequest.getPasswordNumber().equals("123")){
            result.setResp( "OK");
        }
        return result;
    }

}
