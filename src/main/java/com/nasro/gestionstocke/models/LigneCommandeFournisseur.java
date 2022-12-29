package com.nasro.gestionstocke.models;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;


@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "lignecommandefournisseur")
public class LigneCommandeFournisseur extends AbstractEntity {
    @ManyToOne
    @JoinColumn(name = "clientId")
    private Article article;
    @ManyToOne
    @JoinColumn(name = "commandeFournisseurId")
    private CommandeFournisseur commandeFournisseur;
    private BigDecimal quantité;
    private BigDecimal praixUnitaire;
}
