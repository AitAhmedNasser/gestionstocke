package com.nasro.gestionstocke.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "utilisateur")
public class Utilisateur extends AbstractEntity {
    private String nom;
    private String prenom;
    private String dateDeNaissance;
    private String mail;
    private String motDePasse;
    @OneToOne
    private Adress adress;
    private String photo;
    @ManyToOne
    @JoinColumn(name = "entrepriseId")
    private Entreprise entreprise;
    @OneToMany(mappedBy = "utilisateur")
    private List<Role> roles;

}
