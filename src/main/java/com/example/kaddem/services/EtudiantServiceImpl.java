package com.example.kaddem.services;

import com.example.kaddem.entities.Etudiant;
import com.example.kaddem.exceptions.EtudiantNotFoundException;
import com.example.kaddem.repositories.EtudiantRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class EtudiantServiceImpl implements EtudiantService {

    private EtudiantRepository etudiantRepository;
    @Override
    public Etudiant getEtudiant(Long etudiantId) throws EtudiantNotFoundException {
        Etudiant etudiant = etudiantRepository.findById(etudiantId)
                .orElseThrow(()->new EtudiantNotFoundException("Etudiant not found"));
        return etudiant;
    }
    @Override
    public List<Etudiant> listEtudiants() {
        List<Etudiant> etudiants = etudiantRepository.findAll();
        return etudiants;
    }

}
