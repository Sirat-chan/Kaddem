package com.example.kaddem.services;

import com.example.kaddem.entities.Etudiant;
import com.example.kaddem.exceptions.EtudiantNotFoundException;

import java.util.List;

public interface EtudiantService {
    Etudiant getEtudiant(Long etudiantId) throws EtudiantNotFoundException;

    List<Etudiant> listEtudiants();

}
