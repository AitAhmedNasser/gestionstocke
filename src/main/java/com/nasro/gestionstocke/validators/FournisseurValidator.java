package com.nasro.gestionstocke.validators;

import com.nasro.gestionstocke.dto.FournisseurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class FournisseurValidator {
    public static List<String> validate(FournisseurDto fournisseurDto) {
        List<String> errors = new ArrayList<>();

        if (fournisseurDto == null) {
            errors.add("Veuillez remplir le nom de fournisseur");
            errors.add("Veuillez remplir le prenom de fournisseur");
            errors.add("Veuillez remplir le mail de fournisseur");
            errors.add("Veuillez remplir la photo de fournisseur");
            errors.add("Veuillez remplir le numero de tele de fournisseur");
            return errors;

        }
        if (!StringUtils.hasLength(fournisseurDto.getNom())) {
            errors.add("Veuillez remplir le nom de fournisseur");

        }
        if (!StringUtils.hasLength(fournisseurDto.getPrenom())) {
            errors.add("Veuillez remplir le prenom de fournisseur");
        }
        if (!StringUtils.hasLength(fournisseurDto.getMail())) {
            errors.add("Veuillez remplir le mail de fournisseur");
        }
        if (!StringUtils.hasLength(fournisseurDto.getPhoto())) {
            errors.add("Veuillez remplir la photo de fournisseur");
        }
        if (!StringUtils.hasLength(fournisseurDto.getNumTel())) {
            errors.add("Veuillez remplir le numero de tele de fournisseur");
        }

        return errors;

    }
}
