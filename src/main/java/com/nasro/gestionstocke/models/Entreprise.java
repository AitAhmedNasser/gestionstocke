package com.nasro.gestionstocke.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "entreprise")
public class Entreprise extends AbstractEntity {
    private String nom;
    private String description;
    @OneToOne
    private Adress adress;
    private String codeFiscale;
    private String photo;
    private String email;
    private String numTel;
    @OneToMany(mappedBy = "entreprise")
    private List<Utilisateur> utilisateurs;

}
