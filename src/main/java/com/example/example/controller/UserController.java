package com.example.example.controller;

import com.example.example.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/user-info")
    public void printUserInfo(@RequestBody User user) {
        System.out.println("Name: " + user.getName() + ", Age: " + user.getAge() + ", Gender: " + user.getGender());
    }
}