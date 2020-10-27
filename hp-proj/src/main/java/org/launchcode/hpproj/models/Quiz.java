package org.launchcode.hpproj.models;

import org.json.simple.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class Quiz extends AbstractEntity{

    private String name;

    private List<String> questions;

    private ArrayList<JSONArray> options;

    private ArrayList<Long> correctAnswerIndex;

    public Quiz(String name, List<String> questions, ArrayList<JSONArray> options,
                ArrayList<Long> correctAnswerIndex) {
        this.name = name;
        this.questions = questions;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public Quiz() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getQuestions() {
        return questions;
    }

    public void setQuestions(List<String> questions) {
        this.questions = questions;
    }

    public ArrayList<JSONArray> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<JSONArray> options) {
        this.options = options;
    }

    public ArrayList<Long> getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

}
