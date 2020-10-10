package org.launchcode.hpproj.controllers;

import org.launchcode.hpproj.models.data.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("quizzes")
public class QuizController {

    @Autowired
    QuizRepository quizRepository;




    @GetMapping
    public String displayQuizzes(){
        return "quizzes/index";
    }


//    @GetMapping
//    public String takeQuiz(){
////    Will need to iterate thru questions stored in array for each quiz
//
//
//    }
}
