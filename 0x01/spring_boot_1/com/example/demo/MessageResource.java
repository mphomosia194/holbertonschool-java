package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/messages")
public class MessageResource {

    @GetMapping("/simpleMessageWelcome")
    public String simpleMessageWelcome() {
        return "WELCOME TO THE MICRO-SERVICE CLASS USING SPRING BOOT!!!";
    }

    @GetMapping("/login")
    public String login(@RequestParam(required = false) String user,
                        @RequestParam(required = false) String password) {

        if (user == null || password == null || user.isEmpty() || password.isEmpty()) {
            return "USER AND PASSWORD NOT PROVIDED";
        }

        if (user.length() > 15 || password.length() > 15) {
            return "USER AND PASSWORD INVALID";
        }

        return "LOGIN SUCCESSFUL!!!";
    }
}
