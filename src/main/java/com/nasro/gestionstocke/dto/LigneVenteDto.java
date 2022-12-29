package com.nasro.gestionstocke.dto;

import com.nasro.gestionstocke.models.LigneVente;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class LigneVenteDto {
    private Long id;

    private VenteDto vente;
    private BigDecimal quantité;
    private BigDecimal praixUnitaire;

    public LigneVenteDto fromEntity(LigneVente ligneVente) {
        if (ligneVente == null) {
            //TODO Throw an exception
        }
        return LigneVenteDto.builder()
                .id(ligneVente.getId())
                .quantité(ligneVente.getQuantité())
                .praixUnitaire(ligneVente.getPraixUnitaire())
                .build();

    }

    public LigneVente toEntity(LigneVenteDto ligneVenteDto) {
        if (ligneVenteDto == null) {
            //TODO Thtow an exception
        }
        LigneVente ligneVente = new LigneVente();
        ligneVente.setQuantité(ligneVenteDto.getQuantité());
        ligneVente.setPraixUnitaire(ligneVente.getPraixUnitaire());
        return ligneVente;
    }
}
