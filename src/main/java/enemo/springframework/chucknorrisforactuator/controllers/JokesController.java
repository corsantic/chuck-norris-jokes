package enemo.springframework.chucknorrisforactuator.controllers;

import enemo.springframework.chucknorrisforactuator.services.ChuckNorrisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    ChuckNorrisService chuckNorrisService;


    @Autowired
    public JokesController(ChuckNorrisService chuckNorrisService) {
        this.chuckNorrisService = chuckNorrisService;
    }

    @RequestMapping({"/",""})
    public String getJoke(Model model) {


        model.addAttribute("joke", chuckNorrisService.randomQuote());

        return "jokes";

    }




}
