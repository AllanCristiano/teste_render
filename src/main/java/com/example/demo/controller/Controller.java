package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class Controller {
    
    @GetMapping
    public String getMethodName() {
        return new String("Hello World");
    }

    @GetMapping("/books")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    
}
