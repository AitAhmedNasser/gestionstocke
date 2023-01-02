package com.nasro.gestionstocke.repositories;

import com.nasro.gestionstocke.models.MvtStck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MvStckRepository extends JpaRepository<MvtStck, Long> {
}
