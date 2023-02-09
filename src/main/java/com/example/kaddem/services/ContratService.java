package com.example.kaddem.services;

import com.example.kaddem.entities.Contrat;
import com.example.kaddem.entities.Etudiant;
import com.example.kaddem.exceptions.ContratNotFoundException;
import com.example.kaddem.exceptions.EtudiantNotFoundException;

import java.util.List;

public interface ContratService {


    Contrat getContrat(Long contratId) throws EtudiantNotFoundException, ContratNotFoundException;
     List<Contrat> listContrats();

    Contrat saveContrat(Contrat contrat);

    Contrat updateContrat(Contrat contrat);

    void deleteContrat(Long id);
}
