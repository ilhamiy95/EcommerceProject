package com.example.site_ecom.exception;

import net.bytebuddy.implementation.bind.annotation.Super;

public class VoitureNotFoundException extends RuntimeException{
    public VoitureNotFoundException(String message){
       super(message);
    }

}
