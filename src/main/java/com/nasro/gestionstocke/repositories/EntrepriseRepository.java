package com.nasro.gestionstocke.repositories;

import com.nasro.gestionstocke.models.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {
}
