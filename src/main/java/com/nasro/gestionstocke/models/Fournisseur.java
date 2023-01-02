package com.nasro.gestionstocke.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "fournisseur")
public class Fournisseur extends AbstractEntity {
    private String nom;
    private String prenom;
    @OneToOne
    private Adress adress;
    private String mail;
    private String numTel;
    private String photo;
    @OneToMany(mappedBy = "fournisseur")
    private List<CommandeFournisseur> commandeFournisseurs;
    private Integer entrepriseId;

}
