package com.nasro.gestionstocke.services.impl;

import com.nasro.gestionstocke.dto.ArticleDto;
import com.nasro.gestionstocke.exceptions.ErrorsCode;
import com.nasro.gestionstocke.exceptions.InvalideEntityException;
import com.nasro.gestionstocke.models.Article;
import com.nasro.gestionstocke.repositories.ArticleRepository;
import com.nasro.gestionstocke.services.ArticleService;
import com.nasro.gestionstocke.validators.ArticleValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service

public class ArticleServiceImpl implements ArticleService {


    private ArticleRepository articleRepository;

    @Autowired
    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;

    }

    @Override
    public ArticleDto save(ArticleDto articleDto) {

        List<String> errors = ArticleValidator.validate(articleDto);
        if (!errors.isEmpty()) {
            log.error("Article is not valide {}", articleDto);
            throw new InvalideEntityException("L'article n'est pas valide ", ErrorsCode.ARTICLE_NOT_VALIDE);
        }
        return articleDto.fromEntity(articleRepository.save(
                articleDto.toEntity(articleDto)
        ));
    }

    @Override
    public List<ArticleDto> findAll() {
        return null;
    }

    @Override
    public ArticleDto findById(Long Id) {
        return null;
    }

    @Override
    public ArticleDto findByCodeArticle(String codeArticle) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
