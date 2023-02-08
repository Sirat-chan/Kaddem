package com.example.kaddem.web;

import com.example.kaddem.entities.Etudiant;
import com.example.kaddem.exceptions.EtudiantNotFoundException;
import com.example.kaddem.services.EtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class EtudiantController {
    private EtudiantService etudiantService;

    @GetMapping("/etudiant/{etudiantId}")
    public Etudiant getEtudiant(@PathVariable Long etudiantId) throws EtudiantNotFoundException {
        return etudiantService.getEtudiant(etudiantId);
    }
    @GetMapping("/etudiants")
    public List<Etudiant> ListEtudiants(){
        return etudiantService.listEtudiants();
    }
}
