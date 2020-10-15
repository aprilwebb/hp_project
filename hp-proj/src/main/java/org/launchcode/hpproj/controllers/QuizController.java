package org.launchcode.hpproj.controllers;

import org.launchcode.hpproj.models.Question;
import org.launchcode.hpproj.models.Quiz;
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

    Question[] triviaQuestions = {
            new Question("What is Dumbledore's full name?", "b", "a, c, d")
    };


    @GetMapping
    public String displayQuizzes(){
        return"quizzes/index";
        }

//    @GetMapping
//    public String triviaQuiz(){
////    Will need to iterate thru questions stored in array for each quiz
//
//
//    }
}
