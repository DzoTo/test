package com.example.springboottutorial2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello-world")
    public String helloWorld(@RequestParam String name){
        return "Hello, worl and " + name;
    }
}
