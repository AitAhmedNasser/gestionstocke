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
@Table(name = "MvtStck")
public class LigneVente extends AbstractEntity {
    @ManyToOne
    @JoinColumn(name = "venteId")
    private Vente vente;
    private BigDecimal quantité;
    private BigDecimal praixUnitaire;
    private Integer entrepriseId;
}
