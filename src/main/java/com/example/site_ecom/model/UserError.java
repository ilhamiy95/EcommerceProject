package com.example.site_ecom.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;

@Data
@AllArgsConstructor

public class UserError {

    private String msg;

}
