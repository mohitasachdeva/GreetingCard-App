package com.example.greetingcart.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;

@Entity
public class GreetingModel {

    @Id
    @GeneratedValue
    int id;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public GreetingModel(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public GreetingModel(){

    }

    String firstName;
    String lastName;
}
