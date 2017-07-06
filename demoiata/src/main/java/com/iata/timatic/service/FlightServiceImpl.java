package com.iata.timatic.service;

import com.iata.timatic.repository.FlightRepository;
import com.iata.timatic.repository.entity.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ayhanugurlu on 7/6/17.
 */
@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    FlightRepository flightRepository;

    @Override
    public List<Flight> getFlights() {
        List<Flight> flights = new ArrayList<>();
        flightRepository.findAll().forEach(flight -> flights.add(flight));
        return flights;
    }
}
