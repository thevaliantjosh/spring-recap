package com.example.team_recap.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/roll-dice")
public class DiceController {

    @GetMapping
    public String dicePage(){
        return "roll-dice";
    }
//
//    @GetMapping("/{number}")
//    public String diceRoll(@PathVariable byte number){
//
//    }


}
