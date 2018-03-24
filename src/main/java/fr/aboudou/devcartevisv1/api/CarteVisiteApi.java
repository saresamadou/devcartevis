package fr.aboudou.devcartevisv1.api;

import fr.aboudou.devcartevisv1.service.DeveloppeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cartevisite")
public class CarteVisiteApi {

    @Autowired
    private DeveloppeurService developpeurService;

    @GetMapping("/info")
    public String afficherCarteVisite() {
        return developpeurService.donnerInformations();
    }
}
