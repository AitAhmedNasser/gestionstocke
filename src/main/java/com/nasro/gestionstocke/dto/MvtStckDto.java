package com.nasro.gestionstocke.dto;

import com.nasro.gestionstocke.models.TypeMvtStk;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Builder
@Data
public class MvtStckDto {
    private Long id;
    private Instant dateMvt;
    private BigDecimal quantite;

    private ArticleDto article;

    private TypeMvtStk typeMvtStk;
}
