package com.nasro.gestionstocke.repositories;

import com.nasro.gestionstocke.models.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ArticleRepository extends JpaRepository<Article, Long> {
/*    @Query("select a from articles where codeArticle =  ")
    List<Article> findByCostumQuery();*/

    Optional<Article> findArticleByCodeArticle(String codeArticle);
}
