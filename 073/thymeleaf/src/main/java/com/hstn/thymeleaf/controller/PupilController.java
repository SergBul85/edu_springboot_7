package com.hstn.thymeleaf.controller;

import com.hstn.thymeleaf.model.Pupil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PupilController {

    @GetMapping("/showPupilForm")
    public String showForm(Model model) {
        Pupil pupil = new Pupil();
        model.addAttribute("pupil", pupil);
        return "pupil-form";
    }



}
