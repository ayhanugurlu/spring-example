package com.iata.timatic.rs.controller;

import com.iata.timatic.service.FlightService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ayhanugurlu on 7/6/17.
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/flight", produces = {MediaType.APPLICATION_JSON_VALUE})
public class FlightController {

    @Autowired
    FlightService flightService;


    @ApiOperation(value = "get flight list")
    @RequestMapping(value = "/flightList/{token}", method = RequestMethod.GET)
    public List<String> etflightList(@PathVariable String token){
        List<String> flights = new ArrayList<>();
        flights.add("test fligth1");
        flights.add("test fligth2");
        flights.add("test fligth3");
        flights.add("test fligth4");
        flights.add("test fligth5");

        return flights;
    }

}
