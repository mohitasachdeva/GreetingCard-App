package com.example.greetingcart.controller;

import com.example.greetingcart.model.GreetingModel;

import com.example.greetingcart.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class GreetingController {

    @Autowired //dependency injection
    GreetingService greetingService;

    @GetMapping("/get")
    public String get()
    {
        return greetingService.display();

    }

    @PostMapping("/user")
    public String save(@RequestBody GreetingModel greetingModel){
        return greetingService.saves(greetingModel);
    }




}
