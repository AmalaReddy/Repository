package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    @GetMapping(path = "/")
    public String sayHello(){
        return "Hello! How are you?";
    }
}
