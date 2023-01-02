package com.nasro.gestionstocke.services;

import com.nasro.gestionstocke.dto.ArticleDto;
import com.nasro.gestionstocke.models.Article;

import java.util.List;

public interface ArticleService {

    ArticleDto save(ArticleDto articleDto);

    List<ArticleDto> findAll();

    ArticleDto findById(Long Id);

    ArticleDto findByCodeArticle(String codeArticle);

    void delete(Long id);

}
