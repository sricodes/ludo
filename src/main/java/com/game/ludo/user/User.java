package com.game.ludo.user;
import com.game.ludo.school.School;
import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaQuery;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    int age;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    School school;

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
