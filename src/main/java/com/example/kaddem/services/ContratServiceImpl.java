package com.example.kaddem.services;

import com.example.kaddem.entities.Contrat;
import com.example.kaddem.entities.Etudiant;
import com.example.kaddem.exceptions.ContratNotFoundException;
import com.example.kaddem.exceptions.EtudiantNotFoundException;
import com.example.kaddem.repositories.ContratRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
@Slf4j

public class ContratServiceImpl implements ContratService {
    private ContratRepository contratRepository;
    @Override
    public Contrat getContrat(Long contratId) throws ContratNotFoundException {
        Contrat contrat = contratRepository.findById(contratId)
                .orElseThrow(()->new ContratNotFoundException("Contrat not found"));
        return contrat ;
    }

    @Override
    public List<Contrat> listContrats() {
        List<Contrat> contrats = contratRepository.findAll();
        return contrats;
    }

    @Override
    public Contrat saveContrat(Contrat contrat) {
        Contrat savedContrat =contratRepository.save(contrat);
        return savedContrat;
    }

    @Override
    public Contrat updateContrat(Contrat contrat) {
        Contrat savedContrat = contratRepository.save(contrat);
        return savedContrat;
    }

    @Override
    public void deleteContrat(Long id) {
        contratRepository.deleteById(id);
    }
}
