package kpc.springframework.chucknorisjokes.controllers;

import kpc.springframework.chucknorisjokes.services.JokeService;
import kpc.springframework.chucknorisjokes.services.JokeServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private final JokeService jokeService;

    public JokesController(@Qualifier("jokeServiceImpl") JokeService jokeService) {
        this.jokeService = jokeService;
    }
    @RequestMapping({"/",""})
    public String sayJoke(Model model){
     model.addAttribute("joke",jokeService.getJoke());
     return "index";
    }
}
