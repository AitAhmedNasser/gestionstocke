package com.nasro.gestionstocke.services.impl;

import com.nasro.gestionstocke.dto.ArticleDto;
import com.nasro.gestionstocke.exceptions.EntityNotFoundException;
import com.nasro.gestionstocke.exceptions.ErrorsCode;
import com.nasro.gestionstocke.exceptions.InvalideEntityException;
import com.nasro.gestionstocke.models.Article;
import com.nasro.gestionstocke.repositories.ArticleRepository;
import com.nasro.gestionstocke.services.ArticleService;
import com.nasro.gestionstocke.validators.ArticleValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
    public ArticleDto findById(Long id) {
        if (id == null) {
            log.error("Article Id is null");
            return null;
        }
        Optional<Article> article = articleRepository.findById(id);
        ArticleDto articleDto = null;
        articleDto.fromEntity(article.get());
        return Optional.of(articleDto).orElseThrow(() -> new EntityNotFoundException("Aucun article avec lE CODE Article = "
                + id + " n'est trouvé dans la base de données"
                , ErrorsCode.ARTICLE_NOT_FOUND));
    }

    @Override
    public List<ArticleDto> findAll() {
        return articleRepository.findAll().stream().map(ArticleDto::fromEntity).collect(Collectors.toList());
    }


    @Override
    public ArticleDto findByCodeArticle(String codeArticle) {
        if (!StringUtils.hasLength(codeArticle)) {
            log.error("Article code is null");
            return null;
        }
        Optional<Article> article = articleRepository.findArticleByCodeArticle(codeArticle);
        ArticleDto articleDto = null;
        articleDto.fromEntity(article.get());
        return Optional.of(articleDto).orElseThrow(() -> new EntityNotFoundException("Aucun article avec l'Id = "
                + codeArticle + " n'est trouvé dans la base de données"
                , ErrorsCode.ARTICLE_NOT_FOUND));
        /* return null;*/
    }

    @Override
    public void delete(Long id) {
        if (id == null) {
            log.error("Article Id is null");
            return;
        }
        articleRepository.deleteById(id);

    }
}
