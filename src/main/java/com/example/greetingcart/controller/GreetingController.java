package com.example.greetingcart.controller;

import com.example.greetingcart.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @Autowired//dependency injection
    GreetingService greetingService;

    @GetMapping("/get")
    public String get(){
        return greetingService.display();
    }
}
