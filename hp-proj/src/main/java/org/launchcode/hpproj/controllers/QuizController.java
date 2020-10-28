package org.launchcode.hpproj.controllers;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.launchcode.hpproj.models.Quiz;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("quizzes")
public class QuizController {

    JSONParser parser = new JSONParser();
    Object obj;
    {
        try {
            obj = parser.parse(new FileReader("/Users/Derek & April/Desktop/HP-proj/hp-proj/hp-proj/src/main/resources/quizzes.json"));
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
    JSONObject jsonObject = (JSONObject) obj;

    @GetMapping
    public String displayQuizzes(){
        return"quizzes/index";
        }

    @GetMapping("/trivia")
    public String triviaQuiz(Model model) {
//        if(errors.hasErrors()){
//            return "quizzes/trivia";
//        }
            JSONArray triviaQuestionsArray = (JSONArray) jsonObject.get("triviaQuestions");
            List<String> triviaQuestions = new ArrayList<>();
            ArrayList<JSONArray> triviaOptions = new ArrayList<>();
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

            model.addAttribute("quiz", new Quiz());
            model.addAttribute("questions", triviaQuestions);
            model.addAttribute("options", triviaOptions);
            model.addAttribute("answerIndex", triviaAnswers);

        return "quizzes/trivia";
    }

    @PostMapping("/trivia")
    public String displayTriviaScore(@ModelAttribute ArrayList<Long> triviaAnswers){
        int score = 0;



        return "redirect:";
    }

    @GetMapping("/spellsquiz")
    public String spellsQuiz(Model model) {
//        if(errors.hasErrors()){
//            return "quizzes/trivia";
//        }

            JSONArray spellsQuestionsArray = (JSONArray) jsonObject.get("spellsQuestions");
            List<String> spellsQuestions = new ArrayList<>();
            ArrayList<Object> spellsOptions = new ArrayList<>();
            ArrayList<Long> spellsAnswers = new ArrayList<>();

            for(int i=0; i < spellsQuestionsArray.size(); i++) {
                JSONObject triviaQs = (JSONObject) spellsQuestionsArray.get(i);
                String question = (String) triviaQs.get("question");
                spellsQuestions.add(question);

                JSONArray options = (JSONArray) triviaQs.get("options");
                spellsOptions.add(options);

                long answerIndex = (Long) triviaQs.get("correctAnswerIndex");
                spellsAnswers.add(answerIndex);

            }

            model.addAttribute("quiz", new Quiz());
            model.addAttribute("questions", spellsQuestions);
            model.addAttribute("options", spellsOptions);
            model.addAttribute("answerIndex", spellsAnswers);

        return "quizzes/spells";
    }
}
