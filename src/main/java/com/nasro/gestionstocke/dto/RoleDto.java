package com.nasro.gestionstocke.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RoleDto {
    private Long id;
    private String roleName;
    private UtilisateurDto utilisateur;
}
