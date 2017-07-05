package com.iata.timatic.rs.controller.error;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ayhanugurlu on 7/5/17.
 */
@RestControllerAdvice
public class ExceptionHandlingController extends ResponseEntityExceptionHandler{
    private Logger logger = LoggerFactory.getLogger(ExceptionHandlingController.class);

    @ExceptionHandler({ Exception.class })
    public ResponseEntity<Object> handleConstraintViolation(
            Exception ex, WebRequest request) {
        List<String> errors = new ArrayList<String>();
        errors.add(ex.getMessage() + " " + ex.getCause());


        ApiError apiError =
                new ApiError(HttpStatus.BAD_REQUEST, ex.getLocalizedMessage(), errors);
        return new ResponseEntity<Object>(apiError, new HttpHeaders(), apiError.getStatus());
    }
}
