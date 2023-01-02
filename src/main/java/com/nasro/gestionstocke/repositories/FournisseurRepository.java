package com.nasro.gestionstocke.repositories;

import com.nasro.gestionstocke.models.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Long> {
}
