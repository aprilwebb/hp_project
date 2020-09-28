package org.launchcode.hpproj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("")
    public String home(Model model){
        model.addAttribute("title", "Welcome to Wizarding World Trivia!");
        return "index";
    }

}
