package com.home.managementbackend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/greetUser/{name}")
    public String greetUser(@PathVariable String name){
        return "Hello "+ name + "! Welcome to management platform!" ;
        
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Salutari";
    }
}
