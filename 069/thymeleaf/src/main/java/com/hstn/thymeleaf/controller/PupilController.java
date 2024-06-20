package com.hstn.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PupilController {

    @RequestMapping("/showPupilForm")
    public String showPupilForm() {
        return "pupil-form";
    }

    @RequestMapping("/processPupilForm")
    public String processPupilForm() {
        return "pupil-info";
    }


}
