package com.nasro.gestionstocke.dto;

import com.nasro.gestionstocke.models.Adress;
import com.nasro.gestionstocke.models.Utilisateur;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data

public class UtilisateurDto {
    private Long id;
    private String nom;
    private String prenom;
    private String dateDeNaissance;
    private String mail;
    private String motDePasse;

    private AdressDto adress;
    private String photo;

    private EntrepriseDto entreprise;

    private List<RoleDto> roles;

    public UtilisateurDto fromEntity(Utilisateur utilisateur) {
        if (utilisateur == null) {
            //TODO Throw an exception
        }
        assert utilisateur != null;
        return UtilisateurDto.builder()
                .id(utilisateur.getId())
                .nom(utilisateur.getNom())
                .prenom(utilisateur.getPrenom())
                .dateDeNaissance(utilisateur.getDateDeNaissance())
                .mail(utilisateur.getMail())
                .motDePasse(utilisateur.getMotDePasse())
                .photo(utilisateur.getPhoto())
                .build();
    }

    public Utilisateur toEntity(UtilisateurDto utilisateurDto) {
        if (utilisateurDto == null) {
            //TODO Throw an exception
        }
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom(utilisateurDto.getNom());
        utilisateur.setPrenom(utilisateurDto.getPrenom());
        utilisateur.setMail(utilisateurDto.getMail());
        utilisateur.setMotDePasse(utilisateurDto.getMotDePasse());
        utilisateur.setPhoto(utilisateurDto.getPhoto());
        utilisateur.setDateDeNaissance(utilisateurDto.getDateDeNaissance());
        return utilisateur;
    }
}
