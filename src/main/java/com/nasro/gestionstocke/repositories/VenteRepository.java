package com.nasro.gestionstocke.repositories;

import com.nasro.gestionstocke.models.Vente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenteRepository extends JpaRepository<Vente, Long> {
}
