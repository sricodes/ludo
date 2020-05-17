package com.game.ludo.user;

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

    @GetMapping("/users")
    private List<User> getAllUser(){
        return userServices.getAllUser();
    }
    @GetMapping("users/{id}")
    public Optional<User> getUser(@PathVariable  int id){
        return  userServices.getUser(id);
    }


   /* @GetMapping("users/school/{id}")
    public List<User> geAllUserBySchoolId(@PathVariable  int id){
        return  userServices.getAllUserbySchoolId(id);
    }*/

    @GetMapping("users/schools/{name}")
    public List<User> geAllUserBySchoolName(@PathVariable  String name){
        return  userServices.getAllUserbySchoolName(name);
    }

    @PostMapping("users")
    public void addUser(@RequestBody User user){
        userServices.addUser(user);
    }
    @PutMapping("users/{id}")
    public void updateUser(@RequestBody User user, @PathVariable int id){
        userServices.updateUser(user,id);
    }

   @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id){
       userServices.deleteUser(id);
    }

}
