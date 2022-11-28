package com.example.greetingcart.services;

import com.example.greetingcart.model.GreetingModel;

import com.example.greetingcart.repository.irepoGreet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {
    public String display() {
        return "hello world";
    }
    public String user(String fName , String lName){
        return fName +" "+lName;
    }
    @Autowired
    irepoGreet irepoGreet;



 public GreetingModel saves(GreetingModel greetingModel) {
    return irepoGreet.save(greetingModel);

 }
public GreetingModel getById(int id){
    GreetingModel greetingModel =irepoGreet.findById(id).get();
    return greetingModel;
}
public List<GreetingModel>getAllGreetings(){
     List<GreetingModel> greetingModels=irepoGreet.findAll();
     return greetingModels;
}
    public GreetingModel updateGreeting(GreetingModel greetingModel,int id) {
         greetingModel = irepoGreet.findById(id).get();
        return greetingModel;
    }
    public void deleteByID(int id){
        irepoGreet.deleteById(id);

    }

}


