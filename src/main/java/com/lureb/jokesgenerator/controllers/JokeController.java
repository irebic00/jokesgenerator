package com.lureb.jokesgenerator.controllers;

import com.lureb.jokesgenerator.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "jokes";
    }
}
