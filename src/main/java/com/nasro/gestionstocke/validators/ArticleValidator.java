package com.nasro.gestionstocke.validators;

import com.nasro.gestionstocke.dto.ArticleDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ArticleValidator {
    public static List<String> validate(ArticleDto articleDto) {
        List<String> errors = new ArrayList<>();
        if (articleDto == null) {
            errors.add("Veuillez remplir le code de l'article");
            errors.add("Veuillez remplir la designation de l'article");
            errors.add("Veuillez remplir le praix unitaire HT ");
            errors.add("Veuillez remplir le taux de TVA de l'article");
            errors.add("Veuillez remplir le praix TTC de l'article");
            errors.add("Veuillez remplir la catégoré de l'article");
            return errors;
        }
        if (!StringUtils.hasLength(articleDto.getCodeArticle())) {
            errors.add("Veuillez remplir le code de l'article");
        }
        if (!StringUtils.hasLength(articleDto.getDesignation())) {
            errors.add("Veuillez remplir la designation de l'article");
        }
        if (articleDto.getPraixUnitaireHt() == null) {
            errors.add("Veuillez remplir le praix unitaire HT ");
        }
        if (articleDto.getTauxTva() == null) {
            errors.add("Veuillez remplir le taux de TVA de l'article");
        }
        if (articleDto.getPraixUnitaireTtc() == null) {
            errors.add("Veuillez remplir le praix TTC de l'article");
        }
        if (articleDto.getCategory() == null) {
            errors.add("Veuillez remplir la catégoré de l'article");
        }
        return errors;

    }
}
