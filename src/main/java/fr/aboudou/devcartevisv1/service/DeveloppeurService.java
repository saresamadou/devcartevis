package fr.aboudou.devcartevisv1.service;

import fr.aboudou.devcartevisv1.domain.Developpeur;
import fr.aboudou.devcartevisv1.enums.BU;
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

    Developpeur majEmailDeveloppeur(Long id, String email);

    Developpeur majBuDeveloppeur(Long id, BU bu);

    default String donnerInformations() {
     return aProposApplication;
    }
}
