package com.HR.inskay.controller;
import com.HR.inskay.entity.User;
import com.HR.inskay.services.userservice;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Setter
@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private userservice userService;

    @GetMapping("/kayit")
    public String registrationForm(Model model) {
        model.addAttribute("user", new User());
        return "kayit";
    }

    @PostMapping("/kayit")
    public String registration(User user) {
        userService.saveUser(user);
        return "kayit:/login";
    }

}

