package com.nasro.gestionstocke.models;

import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;
import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "adress")
public class Adress extends AbstractEntity {
    private String adresse1;
    private String adresse2;
    private String ville;
    private String codePostal;
    private String pays;
}
