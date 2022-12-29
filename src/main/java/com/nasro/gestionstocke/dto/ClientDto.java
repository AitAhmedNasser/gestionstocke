package com.nasro.gestionstocke.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nasro.gestionstocke.models.Client;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class ClientDto {
    private Long id;
    private String nom;
    private String prenom;
    private AdressDto adresse;
    private String photo;
    private String mail;
    private String numTel;
    @JsonIgnore
    private List<CommandeClientDto> commandeClients;

    public ClientDto fromEntity(Client client) {
        if (client == null) {
            //TODO THrow an exception

        }
        assert client != null;
        return ClientDto.builder()
                .id(client.getId())
                .nom(client.getNom())
                .prenom(client.getPrenom())
                .mail(client.getMail())
                .build();
    }

    public Client toEntity(ClientDto clientDto) {
        if (clientDto == null) {
            //TODO Throw an exception

        }
        Client client = new Client();
        assert clientDto != null;
        client.setId(clientDto.getId());
        client.setNom(clientDto.getNom());
        client.setPrenom(clientDto.getPrenom());
        client.setMail(clientDto.getMail());
        return client;
    }
}
