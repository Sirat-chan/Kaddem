package com.example.kaddem.repositories;

import com.example.kaddem.entities.Departement;
import com.example.kaddem.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversiteRepository extends JpaRepository<Universite, Long> {
}
