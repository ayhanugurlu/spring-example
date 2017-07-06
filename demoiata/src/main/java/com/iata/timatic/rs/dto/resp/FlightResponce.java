package com.iata.timatic.rs.dto.resp;

import java.util.Date;

/**
 * Created by ayhanugurlu on 7/6/17.
 */
public class FlightResponce {


    private String flightName;


    private String flightDetial;


    private Date flightDate;

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
