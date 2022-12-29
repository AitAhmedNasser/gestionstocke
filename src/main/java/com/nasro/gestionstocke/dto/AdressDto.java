package com.nasro.gestionstocke.dto;

import com.nasro.gestionstocke.models.Adress;
import lombok.Builder;
import lombok.Data;

@Builder
@Data

public class AdressDto {
    private String adresse1;
    private String adresse2;
    private String ville;
    private String codePostal;
    private String pays;

    public AdressDto fromEntity(Adress adress) {
        if (adress == null) {
            //TODO Throw an exception
        }
        return AdressDto.builder()
                .adresse1(adress.getAdresse1())
                .adresse2(adress.getAdresse2())
                .codePostal(adress.getCodePostal())
                .pays(adress.getPays())
                .ville(adress.getVille())
                .build();
    }

    public Adress toEntity(AdressDto adressDto) {
        if (adressDto == null) {
            //TODO Throw an exception
        }
        Adress adress = new Adress();
        adress.setAdresse1(adressDto.getAdresse1());
        adress.setAdresse2(adressDto.getAdresse2());
        adress.setPays(adressDto.getPays());
        adress.setVille(adressDto.getVille());
        adress.setCodePostal(adressDto.getCodePostal());
        return adress;
    }

}
