package com.example.site_ecom.exception;

import com.example.site_ecom.model.ErrorVoiture;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlar1 {
    @ExceptionHandler(VoitureNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorVoiture get(VoitureNotFoundException voitureNotFoundException){
        return new ErrorVoiture(voitureNotFoundException.getMessage());
    }



}
