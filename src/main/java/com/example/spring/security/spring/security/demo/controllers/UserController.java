package com.example.spring.security.spring.security.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/home")
    public String home(){
        return "This is Home";
    }

    @GetMapping("/admin")
    public String admin(){
        return "this is admin";
    }


}
