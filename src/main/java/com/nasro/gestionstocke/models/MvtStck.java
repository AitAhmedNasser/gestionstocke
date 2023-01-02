package com.nasro.gestionstocke.models;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;


@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "MvtStck")
public class MvtStck extends AbstractEntity {
    private Instant dateMvt;
    private BigDecimal quantite;
    @ManyToOne
    @JoinColumn(name = "articleId")
    private Article article;

    private TypeMvtStk typeMvtStk;
    private Integer entrepriseId;

}
