package com.dailycodebuffer.Springboot.tutorial.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    @Value("${welcome.message}")
    private String welcomeMessage;

@GetMapping("/")
    public String helloWorld() {
        return "Welcome to Daily Code Buffer, aaaa" + welcomeMessage;

    }
}
