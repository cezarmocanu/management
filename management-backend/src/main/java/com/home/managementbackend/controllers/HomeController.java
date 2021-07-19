package com.home.managementbackend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/greet")
    public String greetUser(){
        return "Hello user! Welcome to management platform!";
        
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "Salutari";
    }
}
