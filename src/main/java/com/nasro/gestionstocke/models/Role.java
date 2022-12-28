package com.nasro.gestionstocke.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "role")
public class Role extends AbstractEntity {
    private String roleName;
    @ManyToOne
    @JoinColumn(name = "utilisateurId")
    private Utilisateur utilisateur;


}
