package com.game.ludo.user;

import com.game.ludo.school.School;
import com.game.ludo.school.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServices {

    @Autowired
    UserRepository userRepository;
    @Autowired
    SchoolRepository schoolRepository;

    public List<User> getAllUser(){
        return (List<User>) userRepository.findAll();
    }

    public Optional<User> getUser(int id){
        return  userRepository.findById(id);
    }


    public void addUser(User user){
        School input = user.getSchool();
        Optional<School> fromDB = schoolRepository.findByName(input.getName());
        if(fromDB.isPresent()){
            user.setSchool(fromDB.get());
        }
        userRepository.save(user);
    }

    public List<User> getAllUserbySchoolId(int id){

        return userRepository.findBySchoolId(id);
    }

    public List<User> getAllUserbySchoolName(String name){
        return userRepository.findBySchoolName(name);
    }


    public void deleteUser(int id){
        userRepository.deleteById(id);
    }


    public void updateUser(User user, int id) {

        Optional<User> old = userRepository.findById(id);
        if(old.isPresent()){
            User u = old.get();
            if(user.age>0) u.setAge(user.age);
            if(user.name!=null) u.setName(user.name);
            userRepository.save(u);
        }

    }
}
