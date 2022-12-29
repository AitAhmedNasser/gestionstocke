package com.nasro.gestionstocke.dto;

import com.nasro.gestionstocke.models.CommandeClient;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Builder
@Data
public class CommandeClientDto {
    private Long id;
    private String code;
    private Instant dateCommande;

    private ClientDto client;

    private List<LigneCommandeClientDto> lIgneCommandeClienrs;

    public CommandeClientDto fromEntity(CommandeClient commandeClient) {
        if (commandeClient == null) {
            //TODO Throw an exception
        }
        assert commandeClient != null;
        return CommandeClientDto.builder().id(commandeClient.getId())
                .code(commandeClient.getCode())
                .dateCommande(commandeClient.getDateCommande())
                .build();
    }

    public CommandeClient toEntity(CommandeClientDto commandeClientDto) {
        if (commandeClientDto == null) {
            //TODO Throw an exception
        }
        CommandeClient commandeClient = new CommandeClient();
        assert commandeClientDto != null;
        commandeClient.setId(commandeClientDto.getId());
        commandeClient.setCode(commandeClientDto.getCode());
        commandeClient.setDateCommande(commandeClient.getDateCommande());
        return commandeClient;
    }
}
