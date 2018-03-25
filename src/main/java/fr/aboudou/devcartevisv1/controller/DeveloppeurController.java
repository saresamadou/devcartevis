package fr.aboudou.devcartevisv1.controller;

import fr.aboudou.devcartevisv1.domain.Developpeur;
import fr.aboudou.devcartevisv1.service.DeveloppeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DeveloppeurController {

    @Autowired
    private DeveloppeurService developpeurService;

    @GetMapping(value = "/error")
    public String dev() {
        return "error";
    }

    @GetMapping("/developpeurs")
    public String listerDeveloppeur(Model model) {
        List<Developpeur> developpeurs = developpeurService.recupererTousLesDeveloppeurs();
        model.addAttribute("developpeurs", developpeurs);
        return "developpeurs";
    }
}
