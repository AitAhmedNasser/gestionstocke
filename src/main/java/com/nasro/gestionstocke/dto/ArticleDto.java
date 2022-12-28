package com.nasro.gestionstocke.dto;

import com.nasro.gestionstocke.models.Category;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class ArticleDto {
    private String codeArticle;
    private String designation;
    private BigDecimal praixUnitaireHt;
    private BigDecimal tauxTva;
    private BigDecimal praixUnitaireTtc;

    private String photo;

    private CategoryDto category;
}
