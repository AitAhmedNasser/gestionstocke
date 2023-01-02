package com.nasro.gestionstocke.validators;

import com.nasro.gestionstocke.dto.ClientDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ClientValidator {
    public static List<String> validate(ClientDto clientDto) {
        List<String> errors = new ArrayList<>();

        if (clientDto == null) {
            errors.add("Veuillez remplir le nom de client");

        }

        assert clientDto != null;
        if (!StringUtils.hasLength(clientDto.getNom())) {
            errors.add("Veuillez remplir le nom de client");
            errors.add("Veuillez remplir le prenom de client");
            errors.add("Veuillez remplir le numéro de telephone de client");
            errors.add("Veuillez remplir le mail de client");
            errors.add("Veuillez remplir l'adresse de l'utilisateur!!!");
            return errors;
        }
        if (!StringUtils.hasLength(clientDto.getPrenom())) {
            errors.add("Veuillez remplir le prenom de client");
        }
        if (!StringUtils.hasLength(clientDto.getNumTel())) {
            errors.add("Veuillez remplir le numéro de telephone de client");
        }
        if (!StringUtils.hasLength(clientDto.getPhoto())) {
            errors.add("Veuillez define la photo de client");
        }
        if (!StringUtils.hasLength(clientDto.getMail())) {
            errors.add("Veuillez remplir le mail de client");
        }
        if (clientDto.getAdresse() == null) {
            errors.add("Veuillez remplir l'adresse de l'utilisateur!!!");
        } else {
            if (!StringUtils.hasLength(clientDto.getAdresse().getAdresse1())) {
                errors.add("Veuillez remplir l'adresse de l'utilisateur!!!");
            }
            if (!StringUtils.hasLength(clientDto.getAdresse().getPays())) {
                errors.add("Veuillez remplir le Pays de l'utilisateur!!!");
            }
            if (!StringUtils.hasLength(clientDto.getAdresse().getVille())) {
                errors.add("Veuillez remplir la ville de l'utilisateur!!!");
            }
            if (!StringUtils.hasLength(clientDto.getAdresse().getCodePostal())) {
                errors.add("Veuillez remplir le code postale de l'utilisateur!!!");
            }

        }

        return errors;
    }
}
