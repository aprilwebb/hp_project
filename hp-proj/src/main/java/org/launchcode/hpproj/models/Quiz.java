package org.launchcode.hpproj.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Quiz extends AbstractEntity{

    private String name;

    @OneToMany
    private final List<Question> questions = new ArrayList<>();

//    private Score score;

}
