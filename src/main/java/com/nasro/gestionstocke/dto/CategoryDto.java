package com.nasro.gestionstocke.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nasro.gestionstocke.models.Category;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class CategoryDto {
    private Long id;
    private String code;
    private String designation;
    @JsonIgnore
    private List<ArticleDto> articles;

    public CategoryDto fromEntity(Category category) {
        if (category == null) {
            //TODO throw an exception
        }
        assert category != null;
        return CategoryDto.builder()
                .id(category.getId())
                .code(category.getCode())
                .designation(category.getDesignation())
                .build();
        //[Construire un objet de type CategoryDto a partir de Category Entity: Mapping => Category -> CategoryDto]
    }

    public Category toEntity(CategoryDto categoryDto) {
        if (categoryDto == null) {
            //TODO Throw an exception
        }
        Category category = new Category();
        assert categoryDto != null;
        category.setId(categoryDto.getId());
        category.setCode(categoryDto.getCode());
        category.setDesignation(categoryDto.getDesignation());
        return category;
    }
}
