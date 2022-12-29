package com.nasro.gestionstocke.dto;


import com.nasro.gestionstocke.models.Article;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class ArticleDto {
    private Long id;
    private String codeArticle;
    private String designation;
    private BigDecimal praixUnitaireHt;
    private BigDecimal tauxTva;
    private BigDecimal praixUnitaireTtc;

    private String photo;

    private CategoryDto category;

    public ArticleDto fromEntity(Article article) {
        if (article == null) {
            //TODO Throw an exception
        }
        assert article != null;
        return ArticleDto.builder()
                .id(article.getId())
                .codeArticle(article.getCodeArticle())
                .designation(article.getDesignation())
                .build();
    }

    public Article toEntity(ArticleDto articleDto) {
        if (articleDto == null) {
            //TODO Throw an exception
        }
        Article article = new Article();
        assert articleDto != null;
        article.setId(articleDto.getId());
        article.setCodeArticle(articleDto.getCodeArticle());
        article.setDesignation(articleDto.getDesignation());
        return null;
    }
}
