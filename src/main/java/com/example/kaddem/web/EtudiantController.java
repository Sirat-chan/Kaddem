package com.example.kaddem.web;

import com.example.kaddem.entities.Etudiant;
import com.example.kaddem.exceptions.EtudiantNotFoundException;
import com.example.kaddem.services.EtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/add-etudiant")
    public Etudiant saveEtudiant(@RequestBody Etudiant etudiant){
        return etudiantService.saveEtudiant(etudiant);
    }
    @PutMapping("/update-etudiant/{etudiantId}")
    public Etudiant updateEtudiant(@PathVariable Long etudiantId, @RequestBody Etudiant etudiant){
    etudiant.setId(etudiantId);
    return etudiantService.updateEtudiant(etudiant);
    }
    @DeleteMapping("etudiant/{id}")
    public void deleteEtudiant(@PathVariable Long id){
       etudiantService.deleteEtudiant(id);
    }
}
