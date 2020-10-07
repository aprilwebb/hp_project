package org.launchcode.hpproj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("home")
    public String home(){
        return "index";
    }


//    House cup feature controller: needs to query to DB (all users for house is ____) to
//    show who's winning.

//    Rotating fun fact feature controller; link to fun fact page?
//    Should prob be stored in array of facts with use of some random method

//    Featured quiz controller
}
