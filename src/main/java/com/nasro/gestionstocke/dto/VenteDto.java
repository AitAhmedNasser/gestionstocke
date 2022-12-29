package com.nasro.gestionstocke.dto;

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
}
