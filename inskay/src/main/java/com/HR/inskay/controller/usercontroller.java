package com.HR.inskay.controller;

import ch.qos.logback.core.model.Model;
import com.HR.inskay.entity.user;
import com.HR.inskay.services.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class usercontroller {
    @Autowired
    private userservice userService;

    @GetMapping("/registration")
    public String registration(Model model) {
        model.addText("user");
        return "registration";
    }

    @PostMapping("/registration")
    public String registration(user user) {
        userService.saveUser(user);
        return "redirect:/login";
    }
}
