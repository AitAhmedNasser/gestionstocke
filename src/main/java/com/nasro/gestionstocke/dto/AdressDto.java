package com.nasro.gestionstocke.dto;

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

}
