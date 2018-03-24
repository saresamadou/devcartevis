package fr.aboudou.devcartevisv1.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cartevisite")
public class CarteVisiteApi {

    @GetMapping("/dev")
    public String afficherCarteVisite() {
        return "Application pour visualiser les cartes de visite de nos développeurs, travail en cours...";
    }
}
