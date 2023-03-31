package com.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserConroller {

    @GetMapping
    public String getUser() {
        return "I am the USER :D";
    }
}
