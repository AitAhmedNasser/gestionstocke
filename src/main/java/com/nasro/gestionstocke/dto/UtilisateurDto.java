package com.nasro.gestionstocke.dto;

import com.nasro.gestionstocke.models.Adress;
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
    private String motDePasse;

    private AdressDto adress;
    private String photo;

    private EntrepriseDto entreprise;

    private List<RoleDto> roles;
}
