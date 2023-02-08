package com.example.kaddem.repositories;

import com.example.kaddem.entities.Departement;
import com.example.kaddem.entities.DetailEquipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailEquipeRepository extends JpaRepository<DetailEquipe, Long> {
}
