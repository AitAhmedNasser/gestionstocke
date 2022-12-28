package com.nasro.gestionstocke.dto;

import com.nasro.gestionstocke.models.Article;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class CategoryDto {
    private String code;
    private String designation;
   
    private List<Article> articles;
}
