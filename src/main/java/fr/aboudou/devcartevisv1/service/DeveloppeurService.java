package fr.aboudou.devcartevisv1.service;

import fr.aboudou.devcartevisv1.domain.Developpeur;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

/**
 * Interface indiquant les services
 */
public interface DeveloppeurService {

    @Value("${devcartevis.message.info}")
    String aProposApplication = "Application pour consulter les cartes de visiste des développeurs";

    List<Developpeur> recupererTousLesDeveloppeurs();
    Developpeur recupererDeveloppeurParId(Long id);

    Developpeur ajouterNouveauDeveloppeur(Developpeur developpeur);

    default String donnerInformations() {
     return aProposApplication;
    }
}
