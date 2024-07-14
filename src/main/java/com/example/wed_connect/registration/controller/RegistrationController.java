package com.example.wed_connect.registration.controller;

import com.example.wed_connect.registration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import com.example.wed_connect.registration.model.User;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user, Model model) {
        String result = userService.registerUser(user);
        if (result.equals("User registered successfully")) {
            model.addAttribute("successMessage", result);
        } else {
            model.addAttribute("errorMessage", result);
        }
        return "register";
    }
}
