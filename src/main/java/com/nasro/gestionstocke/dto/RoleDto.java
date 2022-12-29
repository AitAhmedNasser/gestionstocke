package com.nasro.gestionstocke.dto;

import com.nasro.gestionstocke.models.Role;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RoleDto {
    private Long id;
    private String roleName;
    private UtilisateurDto utilisateur;

    public RoleDto fromEntity(Role role) {
        if (role == null) {
            //TODO Throw an exception
        }
        return RoleDto.builder().id(role.getId())
                .roleName(role.getRoleName())
                .build();
    }

    public Role toEntity(RoleDto roleDto) {
        if (roleDto == null) {
            //TODO Throw an exception
        }
        Role role = new Role();
        role.setRoleName(role.getRoleName());
        return role;
    }
}
