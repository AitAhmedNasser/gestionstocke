package com.nasro.gestionstocke.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "client")
public class Client extends AbstractEntity {
    private String nom;
    private String prenom;
    @ManyToOne
    private Adress adresse;
    private String photo;
    private String mail;
    private String numTel;
    @OneToMany(mappedBy = "client")
    private List<CommandeClient> commandeClients;
}
