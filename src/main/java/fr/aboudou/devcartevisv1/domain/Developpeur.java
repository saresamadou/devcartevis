package fr.aboudou.devcartevisv1.domain;


import fr.aboudou.devcartevisv1.enums.BU;
import fr.aboudou.devcartevisv1.enums.TypeDeveloppeur;

import javax.persistence.*;

/**
 * Classe representant un développeur
 */
@Entity
@Table(name = "t_developpeurs")
public class Developpeur {

    /**
     * Identifiant interne du développeur au sein de l'ESN
     */
    @Id
    @Column(name = "dev_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long identifiant;

    /**
     * Nom du développeur
     */
    @Column(name = "dev_nom")
    private String nom;

    /**
     * Email du développeur
     */
    @Column(name = "dev_email")
    private String email;

    /**
     * Le type de développeur
     */
    @Column(name = "dev_type")
    @Enumerated(EnumType.STRING)
    private TypeDeveloppeur typeDeveloppeur;

    /**
     * La BU à laquelle appartient le developpeur
     */
    @Column(name = "dev_bu")
    @Enumerated(EnumType.STRING)
    private BU bu;

    public Developpeur() {
    }

    public Developpeur(String nom, String email, TypeDeveloppeur typeDeveloppeur, BU bu) {
        this.nom = nom;
        this.email = email;
        this.typeDeveloppeur = typeDeveloppeur;
        this.bu = bu;
    }

    public Long getIdentifiant() {
        return identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TypeDeveloppeur getTypeDeveloppeur() {
        return typeDeveloppeur;
    }

    public void setTypeDeveloppeur(TypeDeveloppeur typeDeveloppeur) {
        this.typeDeveloppeur = typeDeveloppeur;
    }

    public BU getBu() {
        return bu;
    }

    public void setBu(BU bu) {
        this.bu = bu;
    }
}
