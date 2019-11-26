package pl.piotrlenar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.piotrlenar.entities.Referee;
import pl.piotrlenar.repositories.RefereeRepository;

@Controller
@RequestMapping("/referee")
public class RefereeController {

    private final RefereeRepository refereeRepository;

    public RefereeController(RefereeRepository refereeRepository){
        this.refereeRepository = refereeRepository;
    }

    @ModelAttribute("referee")
    public Referee createReferee(){
        return new Referee();
    }

    @GetMapping("/register")
    public String addReferee(){
        return "referee-form";
    }

    @PostMapping("/register")
    public String processReferee(){
        return "referee-success";
    }
}
