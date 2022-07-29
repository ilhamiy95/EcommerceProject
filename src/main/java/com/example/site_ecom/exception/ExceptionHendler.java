package com.example.site_ecom.exception;

import com.example.site_ecom.model.UserError;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHendler {
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public UserError getError(UserNotFoundException userNotFoundException){
        UserError error=new UserError(userNotFoundException.getMessage());
        return error;
    }
}
