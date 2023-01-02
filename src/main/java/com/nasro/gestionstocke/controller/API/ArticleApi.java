package com.nasro.gestionstocke.controller.API;

import com.nasro.gestionstocke.dto.ArticleDto;
import com.nasro.gestionstocke.services.ArticleService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.nasro.gestionstocke.utils.Constants.APP_ROOT;

public interface ArticleApi {
    @PostMapping(value = APP_ROOT + "/article/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ArticleDto save(@RequestBody ArticleDto articleDto);

    ArticleDto save(ArticleService articleService);

    @GetMapping(value = APP_ROOT + "/article/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ArticleDto findById(@PathVariable Long id);

    @GetMapping(value = APP_ROOT + "/article/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    List<ArticleDto> findAll();

    @GetMapping(value = APP_ROOT + "/article/{codeArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
    ArticleDto findByCodeArticle(String codeArticle);

    @DeleteMapping(value = APP_ROOT + "/article/delete/{id}")
    void delete(@PathVariable Long id);
}
