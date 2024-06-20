package com.hstn.thymeleaf.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class OldPupilController {

    @RequestMapping("/showPupilForm")
    public String showPupilForm() {
        return "old-pupil-form";
    }

    @RequestMapping("/processPupilForm")
    public String processPupilForm() {
        return "pupil-info";
    }

    @RequestMapping("/processPupilFormV2")
    public String correctName(HttpServletRequest request, Model model) {
        String oldNameLowerCase = request.getParameter("pupilName").toLowerCase();
        String correctName = "";
        String[] words = oldNameLowerCase.split(" ");
        for (String word : words) {
            String firstLetter = word.substring(0, 1).toUpperCase();
            word = firstLetter + word.substring(1);
            correctName += word + " ";
        }
        correctName=correctName.trim();
        model.addAttribute("correctName", correctName);
        return "pupil-info";
    }

    @RequestMapping(value = "/processPupilFormV3", method = RequestMethod.POST)
    public String correctName3(@RequestParam("pupilName") String pupilName, Model model) {
        String oldNameLowerCase = pupilName.toLowerCase();
        String correctName = "";
        String[] words = oldNameLowerCase.split(" ");
        for (String word : words) {
            String firstLetter = word.substring(0, 1).toUpperCase();
            word = firstLetter + word.substring(1);
            correctName += word + " ";
        }
        correctName=correctName.trim();
        model.addAttribute("correctName", correctName);
        return "pupil-info";
    }


}
