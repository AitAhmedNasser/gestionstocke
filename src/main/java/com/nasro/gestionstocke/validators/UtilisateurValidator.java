package com.nasro.gestionstocke.validators;

import com.nasro.gestionstocke.dto.UtilisateurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurValidator {

    public List<String> validate(UtilisateurDto utilisateurDto) {
        List<String> errors = new ArrayList<>();
        if (utilisateurDto == null) {
            errors.add("Veuillez remplir le nom de l'utilisateur!!!");
            errors.add("Veuillez remplir le prenom de l'utilisateur!!!");
            errors.add("Veuillez remplir le mail de l'utilisateur!!!");
            errors.add("Veuillez remplir la date de naissance de l'utilisateur!!!");
            errors.add("Veuillez remplir le mot de passe de l'utilisateur!!!");
            return errors;

        }
        if (!StringUtils.hasLength(utilisateurDto.getNom())) {
            errors.add("Veuillez remplir le nom de l'utilisateur!!!");
        }
        if (!StringUtils.hasLength(utilisateurDto.getPrenom())) {
            errors.add("Veuillez remplir le prenom de l'utilisateur!!!");
        }
        if (!StringUtils.hasLength(utilisateurDto.getMail())) {
            errors.add("Veuillez remplir le mail de l'utilisateur!!!");
        }
        if (!StringUtils.hasLength(utilisateurDto.getDateDeNaissance())) {
            errors.add("Veuillez remplir la date de naissance de l'utilisateur!!!");
        }
        if (!StringUtils.hasLength(utilisateurDto.getMotDePasse())) {
            errors.add("Veuillez remplir le mot de passe de l'utilisateur!!!");
        }

        if (utilisateurDto.getAdress() == null) {
            errors.add("Veuillez remplir l'adresse de l'utilisateur!!!");
        } else {
            if (!StringUtils.hasLength(utilisateurDto.getAdress().getAdresse1())) {
                errors.add("Veuillez remplir l'adresse de l'utilisateur!!!");
            }
            if (!StringUtils.hasLength(utilisateurDto.getAdress().getPays())) {
                errors.add("Veuillez remplir le Pays de l'utilisateur!!!");
            }
            if (!StringUtils.hasLength(utilisateurDto.getAdress().getVille())) {
                errors.add("Veuillez remplir la ville de l'utilisateur!!!");
            }
            if (!StringUtils.hasLength(utilisateurDto.getAdress().getCodePostal())) {
                errors.add("Veuillez remplir le code postale de l'utilisateur!!!");
            }

        }
        return errors;
    }

}
