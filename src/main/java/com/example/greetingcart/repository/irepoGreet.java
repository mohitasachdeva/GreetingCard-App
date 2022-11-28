package com.example.greetingcart.repository;

import com.example.greetingcart.model.GreetingModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface irepoGreet extends JpaRepository <GreetingModel,Integer> {

}
