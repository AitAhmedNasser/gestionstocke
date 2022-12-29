package com.nasro.gestionstocke.dto;

import com.nasro.gestionstocke.models.Vente;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Builder
@Data
public class VenteDto {
    private Long id;
    private String code;
    private Instant dateVente;
    private String commantaire;

    public VenteDto fromEntity(Vente vente) {
        if (vente == null) {
            //TODO Throw an exception
        }
        return VenteDto.builder()
                .id(vente.getId())
                .code(vente.getCode())
                .dateVente(vente.getDateVente())
                .commantaire(vente.getCommantaire())
                .build();
    }

    public Vente toEntity(VenteDto venteDto) {
        if (venteDto == null) {
            //TODO Throw an exception
        }
        Vente vente = new Vente();
        vente.setDateVente(venteDto.getDateVente());
        vente.setCode(venteDto.getCode());
        vente.setCommantaire(venteDto.getCommantaire());
        return vente;
    }

}
