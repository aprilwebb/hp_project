package org.launchcode.hpproj.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Score extends AbstractEntity{

    private int score;

    private String quizName;

    @ManyToOne
    private User user;

    public Score(int score, String quizName) {
        this.score = score;
        this.quizName = quizName;
    }

    public Score() {
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }
}
