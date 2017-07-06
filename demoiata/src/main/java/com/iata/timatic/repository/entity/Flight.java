package com.iata.timatic.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Ayhan Ugurlu - (ayhanugurlu@gmail.com) on 6.07.2017.
 */
@Entity
public class Flight implements Serializable{

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String flightName;

    @Column(nullable = false)
    private String flightDetial;

    @Column(nullable = false)
    private Date flightDate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getFlightDetial() {
        return flightDetial;
    }

    public void setFlightDetial(String flightDetial) {
        this.flightDetial = flightDetial;
    }

    public Date getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }
}
