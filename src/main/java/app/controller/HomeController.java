package app.controller;

import app.model.User;
import app.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping
public class HomeController {

//    private IUserService userService;
//
//    public HomeController(IUserService userService) {
//        this.userService = userService;
//    }

    @GetMapping("/")
    public String home(Model model){
        User u1 = new User(null, "Pedro Fernandes");
        User u2 = new User(null, "Kikas Fernandes");
//        userService.add(u1);
//        userService.add(u2);

//        List<User> list = userService.findAll();
        List<User> list = new ArrayList<>(){{
            add(u1); add(u2);
        }};
        model.addAttribute("users", list);
        return "index";
    }
}