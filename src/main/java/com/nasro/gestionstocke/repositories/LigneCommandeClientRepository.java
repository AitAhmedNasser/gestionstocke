package com.nasro.gestionstocke.repositories;

import com.nasro.gestionstocke.models.LIgneCommandeClienr;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LigneCommandeClientRepository extends JpaRepository<LIgneCommandeClienr, Long> {
}
