package com.nasro.gestionstocke.repositories;

import com.nasro.gestionstocke.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
