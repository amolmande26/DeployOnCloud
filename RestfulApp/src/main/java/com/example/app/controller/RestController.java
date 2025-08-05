package com.example.app.controller;

import com.example.app.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/myApp")
public class RestController {

    @GetMapping("/getValue")
    public String getValue() {
        return "It's success call";
    }

    @PostMapping("/postValue")
    public ResponseEntity<User> postValue(@RequestBody User user) {

        System.out.println(user.toString());
        return ResponseEntity.ok(user);
    }
}
