package com.nasro.gestionstocke.dto;

import com.nasro.gestionstocke.models.Adress;
import com.nasro.gestionstocke.models.Entreprise;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data

public class EntrepriseDto {
    private Long id;
    private String nom;
    private String description;

    private Adress adress;
    private String codeFiscale;
    private String photo;
    private String email;
    private String numTel;
    private List<UtilisateurDto> utilisateurs;

    public EntrepriseDto fromEntity(Entreprise entreprise) {
        if (entreprise == null) {
            //TODO Throw an exception
        }
        assert entreprise != null;
        return EntrepriseDto.builder()
                .id(entreprise.getId())
                .adress(entreprise.getAdress())
                .nom(entreprise.getNom())
                .description(entreprise.getDescription())
                .email(entreprise.getEmail())
                .numTel(entreprise.getNumTel())
                .photo(entreprise.getPhoto())
                .build();
    }

    public Entreprise toEntity(EntrepriseDto entrepriseDto) {
        if (entrepriseDto == null) {
            //TODO Throw an exception
        }
        Entreprise entreprise = new Entreprise();
        assert entrepriseDto != null;
        entreprise.setNom(entrepriseDto.getNom());
        entreprise.setAdress(entrepriseDto.getAdress());
        entreprise.setEmail(entrepriseDto.getEmail());
        entreprise.setDescription(entrepriseDto.getDescription());
        entreprise.setNumTel(entrepriseDto.getNumTel());
        entreprise.setPhoto(entrepriseDto.getPhoto());
        return null;
    }
}
