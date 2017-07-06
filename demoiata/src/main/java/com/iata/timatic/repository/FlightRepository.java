package com.iata.timatic.repository;

import com.iata.timatic.repository.entity.Flight;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by ayhanugurlu on 7/6/17.
 */
public interface FlightRepository extends CrudRepository<Flight, Long> {

}
