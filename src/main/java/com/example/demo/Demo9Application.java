package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo9Application {


    @Value("${test.test}")
    Integer value;



    public static void main(String[] args) {
        SpringApplication.run(Demo9Application.class, args);
    }

}
