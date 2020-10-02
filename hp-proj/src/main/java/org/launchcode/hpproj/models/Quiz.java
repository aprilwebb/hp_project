package org.launchcode.hpproj.models;

import javax.persistence.Entity;

//@Entity
public class Quiz extends AbstractEntity{

    private String name;

//    OnetoMany?
//    JoinColumn w quiz_id?
    private Question questions;

    private Score score;

}
