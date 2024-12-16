package com.homework.homework16.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SurveyController
{
    private String voteResult;

    @PostMapping("/home")
    public String handleSurvey(@RequestParam(required = false) String option, Model model)
    {
        if (option == null)
        {
            voteResult = "Выберите вариант ответа.";
        }
        else
        {
            voteResult = "Спасибо! Ваш ответ: " + option + ".";
        }
        model.addAttribute("voteResult", voteResult);
        return "home";
    }
}
