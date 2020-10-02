package org.launchcode.hpproj.models;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//@Entity
public class Score extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

//    ManytoMany?
    private Quiz quiz;
}
