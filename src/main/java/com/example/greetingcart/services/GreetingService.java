package com.example.greetingcart.services;

import com.example.greetingcart.model.GreetingModel;

import com.example.greetingcart.repository.irepoGreet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String display() {
        return "hello world";
    }
    @Autowired
    irepoGreet irepoGreet;



 public String saves(GreetingModel greetingModel) {
       irepoGreet.save(greetingModel);
     return "created";
 }

}


