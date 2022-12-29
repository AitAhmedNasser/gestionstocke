package com.nasro.gestionstocke.dto;

import com.nasro.gestionstocke.models.Adress;
import com.nasro.gestionstocke.models.Fournisseur;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data

public class FournisseurDto {
    private Long id;
    private String nom;
    private String prenom;
    private Adress adress;
    private String mail;
    private String numTel;
    private String photo;

    private List<CommandeFournisseurDto> commandeFournisseurs;

    public FournisseurDto fromEntity(Fournisseur fournisseur) {
        if (fournisseur == null) {
            //TODO Throw an exception
        }
        return FournisseurDto.builder()
                .id(fournisseur.getId())
                .nom(fournisseur.getNom())
                .prenom(fournisseur.getPrenom())
                .adress(fournisseur.getAdress())
                .mail(fournisseur.getMail())
                .numTel(fournisseur.getNumTel())
                .photo(fournisseur.getPhoto())
                .build();
    }

    public Fournisseur toEntity(FournisseurDto fournisseurDto) {
        if (fournisseurDto == null) {
            //TODO Throw an exception
        }
        Fournisseur fournisseur = new Fournisseur();
        assert fournisseurDto != null;
        fournisseur.setNom(fournisseurDto.getNom());
        fournisseur.setPrenom(fournisseurDto.getPrenom());
        fournisseur.setAdress(fournisseurDto.getAdress());
        fournisseur.setMail(fournisseurDto.getMail());
        fournisseur.setNumTel(fournisseurDto.getNumTel());
        fournisseur.setPhoto(fournisseurDto.getPhoto());
        return fournisseur;
    }
}
