package org.launchcode.hpproj.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Question extends AbstractEntity{

    private String prompt;

    @NotNull
    private String answer;

    private String wrongAnswers;

    private String letterValue;

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;
//    How will I check the answer if it's a radio button and stored in array?

    public Question(String prompt, String answer, String wrongAnswers) {
        this.prompt = prompt;
        this.answer = answer;
        this.wrongAnswers = wrongAnswers;
    }

    public Question() {

    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getAnswer() {
        return answer;
    }

    public String getWrongAnswers() {
        return wrongAnswers;
    }

}
