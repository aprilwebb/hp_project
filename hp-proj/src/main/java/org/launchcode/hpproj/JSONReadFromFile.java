package org.launchcode.hpproj;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.boot.json.JsonParser;

import java.io.FileReader;
import java.util.Iterator;

public class JSONReadFromFile {
    public static void main(String[] args){
        JSONParser parser = new JSONParser();
        try{
            Object obj = parser.parse(new FileReader("/Users/Derek & April/Desktop/HP-proj/hp-proj/hp-proj/src/main/resources/quizzes.json"));
            JSONObject jsonObject = (JSONObject)obj;
            JSONArray triviaQuestions = (JSONArray) jsonObject.get("triviaQuestions");

            for(int i=0; i < triviaQuestions.size(); i++){
                JSONObject triviaQs = (JSONObject) triviaQuestions.get(i);
                String question = (String) triviaQs.get("question");
                JSONArray options = (JSONArray) triviaQs.get("options");
                System.out.println("\n" + question);

                for(Object option : options){
                    System.out.println(option);
                }
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

