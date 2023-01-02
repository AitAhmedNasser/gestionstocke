package com.nasro.gestionstocke.repositories;

import com.nasro.gestionstocke.models.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
}
