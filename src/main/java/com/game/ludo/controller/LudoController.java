package com.game.ludo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LudoController {

    @GetMapping("/")
    public String home(){
        return "Home Page";
    }
}
