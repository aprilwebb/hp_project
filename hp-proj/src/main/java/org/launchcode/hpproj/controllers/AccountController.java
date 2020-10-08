package org.launchcode.hpproj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("account")
public class AccountController {

    @GetMapping
    public String displayAccountPage(){
        return "account/index";

    }
}
