package org.launchcode.hpproj.controllers;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("quizzes")
public class QuizController {


    @GetMapping
    public String displayQuizzes(){
        return"quizzes/index";
        }

    @GetMapping("/trivia")
    public String triviaQuiz(Model model) {
//        if(errors.hasErrors()){
//            return "quizzes/trivia";
//        }

        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("/Users/Derek & April/Desktop/HP-proj/hp-proj/hp-proj/src/main/resources/quizzes.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray triviaQuestionsArray = (JSONArray) jsonObject.get("triviaQuestions");
            List<String> triviaQuestions = new ArrayList<>();
            ArrayList triviaOptions = new ArrayList<>();
            ArrayList<Long> triviaAnswers = new ArrayList<>();

            for(int i=0; i < triviaQuestionsArray.size(); i++) {
                JSONObject triviaQs = (JSONObject) triviaQuestionsArray.get(i);
                String question = (String) triviaQs.get("question");
                triviaQuestions.add(question);

                JSONArray options = (JSONArray) triviaQs.get("options");
                triviaOptions.add(options);

                long answerIndex = (Long) triviaQs.get("correctAnswerIndex");
                triviaAnswers.add(answerIndex);

            }

            model.addAttribute("questions", triviaQuestions);
            model.addAttribute("options", triviaOptions);
            model.addAttribute("answerIndex", triviaAnswers);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "quizzes/trivia";
    }
}
