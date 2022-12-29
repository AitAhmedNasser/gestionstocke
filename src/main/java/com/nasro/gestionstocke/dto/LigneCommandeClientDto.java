package com.nasro.gestionstocke.dto;

import com.nasro.gestionstocke.models.LIgneCommandeClienr;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data

public class LigneCommandeClientDto {
    private Long id;

    private ArticleDto articles;

    private CommandeClientDto commandeClient;
    private BigDecimal quantité;
    private BigDecimal praixUnitaire;

    public LigneCommandeClientDto fromEntity(LIgneCommandeClienr lIgneCommandeClienr) {
        if (lIgneCommandeClienr == null) {
            //TODO Throw an exception
        }
        assert lIgneCommandeClienr != null;
        return LigneCommandeClientDto.builder().id(lIgneCommandeClienr.getId())
                .quantité(lIgneCommandeClienr.getQuantité())
                .praixUnitaire(lIgneCommandeClienr.getPraixUnitaire())
                .build();
    }

    public LIgneCommandeClienr toEntity(LigneCommandeClientDto ligneCommandeClientDto) {
        if (ligneCommandeClientDto == null) {
            //TODO Throw an exception
        }
        LIgneCommandeClienr lIgneCommandeClienr = new LIgneCommandeClienr();
        assert ligneCommandeClientDto != null;
        lIgneCommandeClienr.setQuantité(ligneCommandeClientDto.getQuantité());
        lIgneCommandeClienr.setPraixUnitaire(ligneCommandeClientDto.getPraixUnitaire());

        return lIgneCommandeClienr;

    }
}
