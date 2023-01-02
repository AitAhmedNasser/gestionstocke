package com.nasro.gestionstocke.repositories;

import com.nasro.gestionstocke.models.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeClientRepository extends JpaRepository<CommandeClient, Long> {
}
