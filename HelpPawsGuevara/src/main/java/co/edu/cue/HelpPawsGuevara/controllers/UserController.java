package co.edu.cue.HelpPawsGuevara.controllers;

import co.edu.cue.HelpPawsGuevara.domain.entities.User;
import co.edu.cue.HelpPawsGuevara.services.UserService;
import co.edu.cue.HelpPawsGuevara.services.impl.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping

public class UserController {
   /* private final UserServiceImpl service;

    public UserController(UserServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/list")
    public String listAllPerson(Model model) {
        List<User> personList = service.list();
        model.addAttribute("personList", personList);
        return "index";
    }

    @GetMapping("/new")
    public String agregar(Model model) {
        model.addAttribute("persona", new User());
        return "form";
    }*/
}
