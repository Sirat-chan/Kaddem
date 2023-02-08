package com.example.kaddem.repositories;

import com.example.kaddem.entities.Departement;
import com.example.kaddem.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipeRepository extends JpaRepository<Equipe, Long> {
}
