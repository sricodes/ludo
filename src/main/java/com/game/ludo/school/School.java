package com.game.ludo.school;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
