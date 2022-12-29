package com.nasro.gestionstocke.dto;

import com.nasro.gestionstocke.models.LigneCommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data

public class LigneCommandeFournisseurDto {
    private Long id;

    private ArticleDto article;

    private CommandeFournisseurDto commandeFournisseur;
    private BigDecimal quantité;
    private BigDecimal praixUnitaire;

    public LigneCommandeFournisseurDto fromEntity(LigneCommandeFournisseur ligneCommandeFournisseur) {
        if (ligneCommandeFournisseur == null) {
            //throw an exception
        }
        assert ligneCommandeFournisseur != null;
        return LigneCommandeFournisseurDto.builder()
                .id(ligneCommandeFournisseur.getId())
                .quantité(ligneCommandeFournisseur.getQuantité())
                .praixUnitaire(ligneCommandeFournisseur.getPraixUnitaire())
                .build();
    }

    public LigneCommandeFournisseur toEntity(LigneCommandeFournisseurDto ligneCommandeFournisseurDto) {
        if (ligneCommandeFournisseurDto == null) {
            //TODO Thtow an exception
        }
        LigneCommandeFournisseur ligneCommandeFournisseur = new LigneCommandeFournisseur();
        assert ligneCommandeFournisseurDto != null;
        ligneCommandeFournisseur.setQuantité(ligneCommandeFournisseurDto.getQuantité());
        ligneCommandeFournisseur.setPraixUnitaire(ligneCommandeFournisseur.getPraixUnitaire());
        return null;
    }
}
