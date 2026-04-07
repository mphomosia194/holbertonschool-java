package com.example.demo2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/messages")
public class HelloWorldResource {

    @GetMapping("/home")
    public String home() {
        return "MAVEN PROJECT (SPRING INITIALIZR) SUCCESSFULLY CREATED!!!";
    }
}
