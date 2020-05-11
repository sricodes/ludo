package com.game.ludo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUser(){
        return (List<User>) userRepository.findAll();
    }

    public Optional<User> getUser(int id){
        return  userRepository.findById(id);
    }

    public void addUser(User user){
        userRepository.save(user);
    }

    public void updateTopic(int id,User user){

    }
    public void deleteUser(int id){
        userRepository.deleteById(id);
    }

}
