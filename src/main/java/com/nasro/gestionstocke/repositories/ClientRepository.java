package com.nasro.gestionstocke.repositories;

import com.nasro.gestionstocke.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
