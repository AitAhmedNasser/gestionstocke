package com.nasro.gestionstocke.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;


@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity
@Table(name = "commandeclient")
public class CommandeClient extends AbstractEntity {
    private String code;
    private Instant dateCommande;
    @ManyToOne
    @JoinColumn(name = "clientId")
    private Client client;
    @OneToMany(mappedBy = "commandeClient")
    private List<LIgneCommandeClienr> lIgneCommandeClienrs;
    private Integer entrepriseId;
}
