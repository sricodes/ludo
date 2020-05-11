package com.game.ludo.user;

import com.game.ludo.school.School;
import com.game.ludo.school.SchoolServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserServices userServices;
    @Autowired
    SchoolServices schoolServices;

    @GetMapping("/user")
    private List<User> getAllUser(){
        return userServices.getAllUser();
    }
    @GetMapping("user/{id}")
    public Optional<User> getUser(@PathVariable  int id){
        return  userServices.getUser(id);
    }


    @GetMapping("user/{id}/school")
    public School getSchool(@PathVariable  int id){
        return  null;
    }
    @PostMapping ("user/{id}/school")
    public void addSchool(@RequestBody School school){
        schoolServices.addSchool(school);
    }

    @PostMapping("user")
    public void addUser(@RequestBody User user){
        userServices.addUser(user);
    }


   @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable int id){
       userServices.deleteUser(id);
    }

}
