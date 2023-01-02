package com.nasro.gestionstocke.controller;

import com.nasro.gestionstocke.controller.API.ArticleApi;
import com.nasro.gestionstocke.dto.ArticleDto;
import com.nasro.gestionstocke.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ArticleController implements ArticleApi {
    private ArticleService articleService;

    @Autowired

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @Override
    public ArticleDto save(ArticleDto articleDto) {
        return articleService.save(articleDto);
    }

    @Override
    public ArticleDto save(ArticleService articleService) {
        return null;
    }

  /*  @Override
    public ArticleDto save(ArticleService articleService) {
        return null;
    }*/

    @Override
    public ArticleDto findById(Long id) {
        return articleService.findById(id);
    }

    @Override
    public List<ArticleDto> findAll() {
        return articleService.findAll();
    }

    @Override
    public ArticleDto findByCodeArticle(String codeArticle) {
        return articleService.findByCodeArticle(codeArticle);
    }

    @Override
    public void delete(Long id) {
        articleService.delete(id);

    }
}
