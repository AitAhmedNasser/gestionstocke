package com.nasro.gestionstocke.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;


@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "lignecommande")
public class LIgneCommandeClienr extends AbstractEntity {
    @ManyToOne
    @JoinColumn(name = "articleId")
    private Article articles;
    @ManyToOne
    @JoinColumn(name = "commandeClientId")
    private CommandeClient commandeClient;
    private BigDecimal quantité;
    private BigDecimal praixUnitaire;
}
