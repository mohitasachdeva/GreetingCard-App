package com.example.greetingcart.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String display(){
        return "hello world";
    }
}
