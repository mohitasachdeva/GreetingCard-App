package com.example.greetingcart.controller;

import com.example.greetingcart.model.GreetingModel;

import com.example.greetingcart.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class GreetingController {

    @Autowired //dependency injection
    GreetingService greetingService;

    //Uc1
    @GetMapping("/get")
    public String get()
    {
        return greetingService.display();

    }
    //uc2 to 3
    @PostMapping
    public String users(@RequestBody  String fName , String lName){
        return greetingService.user(fName,lName);
    }
    //uc4

    @PostMapping("/user")
    public GreetingModel save(@RequestBody GreetingModel greetingModel){
        return greetingService.saves(greetingModel);
    }
//    //uc5
    @GetMapping("/getting/{id}")
    public GreetingModel gets(@PathVariable int id)
    {
        return greetingService.getById(id);
    }
    //uc6
    @GetMapping("/all")
    public List<GreetingModel>greetingModelsFindAll(){
        return greetingService.getAllGreetings();
}
//    //uc7
//    @PutMapping("/update/{id}")
//    public GreetingModel greeting(@RequestBody GreetingModel greetingModel, @PathVariable int id)
//    {
//        return  greetingService.updateGreeting(greetingModel,id);
//    }
//    //uc8
//    @DeleteMapping("/del/{id}")
//    public void del(@PathVariable int id)
//    {
//        greetingService.deleteByID(id);
//
//    }

}
