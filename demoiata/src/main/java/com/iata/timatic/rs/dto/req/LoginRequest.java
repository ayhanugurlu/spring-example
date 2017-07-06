package com.iata.timatic.rs.dto.req;

/**
 * Created by Ayhan Ugurlu - (ayhan.ugurlu@odc.com.tr) on 6.07.2017.
 */
public class LoginRequest {

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
