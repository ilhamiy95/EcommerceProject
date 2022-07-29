package com.example.site_ecom.exception;

import com.example.site_ecom.model.ErrorVoiture;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class ExceptionHandler2 {

    @ExceptionHandler(PrdException.class)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ErrorVoiture get(PrdException prdException){
        return new ErrorVoiture(prdException.getMessage());
    }
}
