package fr.aboudou.devcartevisv1.service.impl;

import fr.aboudou.devcartevisv1.domain.Developpeur;
import fr.aboudou.devcartevisv1.exceptions.DeveloppeurDejaExistantException;
import fr.aboudou.devcartevisv1.exceptions.DeveloppeurNotFoundException;
import fr.aboudou.devcartevisv1.repository.DeveloppeurRepository;
import fr.aboudou.devcartevisv1.service.DeveloppeurService;
import org.apache.commons.collections.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

@Service
public class DeveloppeurServiceImpl implements DeveloppeurService {

    @Value("${devcartevis.message.developpeur.non.trouvee:Pas de développeur}")
    private String messageDeveloppeurNonTrouve;

    @Value("${devcartevis.message.developpeur.non.trouvee:Developpeur dejà existant}")
    private String messageDeveloppeurDejaExistant;

    @Autowired
    private DeveloppeurRepository developpeurRepository;

    @Override
    public List<Developpeur> recupererTousLesDeveloppeurs() {
        return IteratorUtils.toList(developpeurRepository.findAll().iterator());
    }

    @Override
    public Developpeur recupererDeveloppeurParId(Long id) {
        verifierExistanceDeveloppeur(id);
        return  developpeurRepository.findById(id).get();
    }

    @Override
    public Developpeur ajouterNouveauDeveloppeur(Developpeur developpeur) {
        verifierExistanceDeveloppeur(developpeur.getEmail());
        return developpeurRepository.save(developpeur);
    }

    private void verifierExistanceDeveloppeur(String email) {
        Developpeur developpeur = developpeurRepository.findByEmail(email);
        if(developpeur != null) {
            throw new DeveloppeurDejaExistantException(messageDeveloppeurDejaExistant);
        }
    }

    private void verifierExistanceDeveloppeur(Long id) {
        Optional<Developpeur> optionalDeveloppeur = developpeurRepository.findById(id);
        if(!optionalDeveloppeur.isPresent()) {
            throw new DeveloppeurNotFoundException(messageDeveloppeurNonTrouve);
        }
    }
}
