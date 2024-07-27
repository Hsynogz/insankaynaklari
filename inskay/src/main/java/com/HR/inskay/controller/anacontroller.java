package com.HR.inskay.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class anacontroller {
    @GetMapping("/")
    public String home(Model model) {
        model.addText("message");
        return "home";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
