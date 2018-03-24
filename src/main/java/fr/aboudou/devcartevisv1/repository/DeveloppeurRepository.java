package fr.aboudou.devcartevisv1.repository;

import fr.aboudou.devcartevisv1.domain.Developpeur;
import org.springframework.data.repository.CrudRepository;

public interface DeveloppeurRepository extends CrudRepository<Developpeur, Long> {
    Developpeur findByEmail(String email);
}
