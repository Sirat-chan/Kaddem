package com.example.kaddem.repositories;

import com.example.kaddem.entities.Departement;
import com.example.kaddem.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    Etudiant findByNomEtudiant(String nom);
}
