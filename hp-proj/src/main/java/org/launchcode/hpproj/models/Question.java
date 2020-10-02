package org.launchcode.hpproj.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

//@Entity
public class Question extends AbstractEntity{

    private String prompt;

    @NotNull
    private final String answer;
//    How will I check the answer if it's a radio button and stored in array?

    public Question(String prompt, String answer) {
        this.prompt = prompt;
        this.answer = answer;
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

}
