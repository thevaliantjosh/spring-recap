package com.example.team_recap.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/posts")
public class PostController {

    @GetMapping
    @ResponseBody
    public String allPosts(){
        return "All the posts live here";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String individualPost(@PathVariable long id){
        return "Viewing an individual post: " + "post " +  id;
    }

    @GetMapping("/create")
    @ResponseBody
    public String createPost(){
        return "Viewing the form for creating a post";
    }

    @PostMapping("/create")
    @ResponseBody
    public String create(){
        return "create a new post";
    }



}
