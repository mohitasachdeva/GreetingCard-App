package com.example.greetingcart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages="com.example.greetingcart.repository")
public class GreetingCartApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreetingCartApplication.class, args);
    }

}
