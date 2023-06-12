package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RefreshScope

public class CustomerProfileController {
    @Value("${test.test}")
    private String value;


    @GetMapping("/customer/{email}")
    public String getCustomerDetails(@PathVariable String email) {
       return "hiilli"+value;
    }
}