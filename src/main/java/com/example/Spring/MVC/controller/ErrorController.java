package com.example.Spring.MVC.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {

    @GetMapping("/access-denied")
    public String accessDeniedPage(Model model) {
        model.addAttribute("errorMessage", "Доступ к этой странице разрешен только для администратора.");
        return "access-denied";
    }
}
