package fr.aboudou.devcartevisv1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {


    @GetMapping("/admin")
    public String administrer() {
        return "redirect:actuator";
    }
}
