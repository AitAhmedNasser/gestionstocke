package com.nasro.gestionstocke.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.Instant;


@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Vente")
public class Vente extends AbstractEntity {
    private String code;
    private Instant dateVente;
    private String commantaire;
    private Integer entrepriseId;

}
