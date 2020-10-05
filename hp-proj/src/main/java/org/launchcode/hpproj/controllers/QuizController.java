package org.launchcode.hpproj.controllers;

import org.launchcode.hpproj.models.Question;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("quizzes")
public class QuizController {

    @GetMapping
    public String displayQuizzes(){
        return "quizzes/index";
    }


//    @GetMapping
//    public String takeQuiz(){
//    Will need to iterate thru questions stored in array for each quiz

//
//    }
}
