package com.hstn.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/hello")
    public String helloWorld(Model model) {
        model.addAttribute("today", java.time.LocalDate.now());
        return "helloworld";
    }

}
