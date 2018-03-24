package fr.aboudou.devcartevisv1.api;

import fr.aboudou.devcartevisv1.domain.Developpeur;
import fr.aboudou.devcartevisv1.params.DevParam;
import fr.aboudou.devcartevisv1.service.DeveloppeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;


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

    @PutMapping(value = "/majEmail", consumes = "application/json")
    public ResponseEntity<Developpeur> majEmailDeveloppeur(@RequestBody DevParam devParam) {
        //TODO : gérer les exceptions
        return new ResponseEntity<>(developpeurService.majEmailDeveloppeur(devParam.getId(),
                devParam.getEmail()), HttpStatus.OK);
    }

    @PutMapping(value = "/majBu", consumes = "application/json")
    public ResponseEntity<Developpeur> majBuDeveloppeur(@RequestBody DevParam devParam) {
        return new ResponseEntity<>(developpeurService.majBuDeveloppeur(devParam.getId(), devParam.getBu()),
                HttpStatus.OK);
    }
}