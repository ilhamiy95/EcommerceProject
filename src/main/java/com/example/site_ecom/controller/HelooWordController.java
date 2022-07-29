package com.example.site_ecom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelooWordController {

    @GetMapping("/ilham")

        public String HelloWord(){
            return"Bonjour tout le Monde ";
        }

    }

