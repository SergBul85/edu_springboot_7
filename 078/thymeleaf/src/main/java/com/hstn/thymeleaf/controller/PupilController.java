package com.hstn.thymeleaf.controller;

import com.hstn.thymeleaf.model.Pupil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PupilController {

    @Value("${cities}")
    private List<String> cities;

    @GetMapping("/showPupilForm")
    public String showForm(Model model) {
        Pupil pupil = new Pupil();
        model.addAttribute("pupil", pupil);
        model.addAttribute("cities", cities);
        return "pupil-form";
    }


    @PostMapping("/processPupilForm")
    public String processPupilForm(@ModelAttribute("pupil") Pupil pupil) {

        System.out.println(pupil);

        return "pupil-confirmation";
    }


}
