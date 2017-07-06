package com.iata.timatic.rs;

import org.springframework.http.HttpStatus;

/**
 * Created by Ayhan Ugurlu - (ayhan.ugurlu@odc.com.tr) on 5.07.2017.
 */
public class RestResponse<T> {

    private int status;

    private T data;

    public RestResponse(HttpStatus status, T data){
        this.status = status.value();
        this.data = data;
    }

}
