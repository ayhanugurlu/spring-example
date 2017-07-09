package com.iata.timatic.rs.dto.req;

/**
 * Created by Ayhan Ugurlu - (ayhan.ugurlu@odc.com.tr) on 6.07.2017.
 */
public class PnlRequest {

    private String passwordNumber;

    private String passengerFullName;

    public String getPasswordNumber() {
        return passwordNumber;
    }

    public void setPasswordNumber(String passwordNumber) {
        this.passwordNumber = passwordNumber;
    }

    public String getPassengerFullName() {
        return passengerFullName;
    }

    public void setPassengerFullName(String passengerFullName) {
        this.passengerFullName = passengerFullName;
    }
}
