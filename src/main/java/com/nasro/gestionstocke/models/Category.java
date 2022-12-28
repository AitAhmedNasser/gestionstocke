package com.nasro.gestionstocke.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "categories")
public class Category extends AbstractEntity {

    private String code;
    private String designation;
    @OneToMany(mappedBy = "category")
    private List<Article> articles;
}
