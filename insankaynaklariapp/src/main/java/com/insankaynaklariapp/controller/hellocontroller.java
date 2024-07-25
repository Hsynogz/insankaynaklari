package com.insankaynaklariapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {
    @GetMapping(path = "/lenin")
    public String sayhello(){
        return "lenin";
    }
}
