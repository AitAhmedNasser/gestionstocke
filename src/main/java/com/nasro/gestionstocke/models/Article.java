package com.nasro.gestionstocke.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "articles")
public class Article extends AbstractEntity {
    private String codeArticle;
    private String designation;
    private BigDecimal praixUnitaireHt;
    private BigDecimal tauxTva;
    private BigDecimal praixUnitaireTtc;

    private String photo;
    @ManyToOne
    @JoinColumn(name = "idCategory")
    private Category category;
}
