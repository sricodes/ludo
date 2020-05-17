package com.game.ludo.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SchoolController {
    @Autowired
    SchoolServices schoolServices;

    @GetMapping("/schools")
    private List<School> getAllSchool(){
        return schoolServices.getAllSchool();
    }
    @GetMapping("schools/{id}")
    public Optional<School> getSchool(@PathVariable  int id){
        return  schoolServices.getSchool(id);
    }

    @PostMapping("schools")
    public void addSchool(@RequestBody School school){
        schoolServices.addSchool(school);
    }


   @DeleteMapping("/schools/{id}")
    public void deleteSchool(@PathVariable int id){
       schoolServices.deleteSchool(id);
    }

}
