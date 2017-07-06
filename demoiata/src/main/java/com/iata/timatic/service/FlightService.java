package com.iata.timatic.service;

import com.iata.timatic.repository.entity.Flight;

import java.util.Date;
import java.util.List;

/**
 * Created by ayhanugurlu on 7/6/17.
 */
public interface FlightService {

    List<Flight> getFlights();

}
