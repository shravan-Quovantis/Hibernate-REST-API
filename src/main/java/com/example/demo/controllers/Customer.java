package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class Customer {

    @RequestMapping("/dashboard")
    @ResponseBody
    public String dashboard(){
        return "customer_dashboard";
    }
}
