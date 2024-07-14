package com.example.wed_connect.registration.controller;

import com.example.wed_connect.registration.service.UserService;
import com.example.wed_connect.registration.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@ModelAttribute User user, Model model) {
        String result = userService.authenticateUser(user);

        if (result.equals("User logged in successfully")) {
            model.addAttribute("successMessage", result);
        } else {
            model.addAttribute("errorMessage", result);
        }
        return "login";
    }
}
