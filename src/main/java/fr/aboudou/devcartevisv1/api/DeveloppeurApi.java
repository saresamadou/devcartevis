package fr.aboudou.devcartevisv1.api;

import fr.aboudou.devcartevisv1.domain.Developpeur;
import fr.aboudou.devcartevisv1.service.DeveloppeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/dev")
public class DeveloppeurApi {

    @Autowired
    private DeveloppeurService developpeurService;

    @GetMapping("/{dev_id}")
    public Developpeur afficherDeveloppeur(@PathVariable long dev_id) {
       return developpeurService.recupererDeveloppeurParId(dev_id);
    }

    @PostMapping(value = "/ajouter", consumes = "application/json")
    public ResponseEntity<Developpeur> ajouterNouveauDeveloppeur(@RequestBody Developpeur developpeur) {
        developpeurService.ajouterNouveauDeveloppeur(developpeur);
        return new ResponseEntity<>(developpeur, HttpStatus.CREATED);
    }
}