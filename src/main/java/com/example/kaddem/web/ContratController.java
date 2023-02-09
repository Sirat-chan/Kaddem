package com.example.kaddem.web;


import com.example.kaddem.entities.Contrat;
import com.example.kaddem.entities.Etudiant;
import com.example.kaddem.exceptions.ContratNotFoundException;
import com.example.kaddem.exceptions.EtudiantNotFoundException;
import com.example.kaddem.services.ContratService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class ContratController {
    private ContratService contratService;

    @GetMapping("/contrat/{contratId}")
    public Contrat getContrat(@PathVariable Long contratId) throws EtudiantNotFoundException, ContratNotFoundException {
        return contratService.getContrat(contratId);
    }
    @GetMapping("/contrats")
    public List<Contrat> ListContrats(){
        return contratService.listContrats();
    }
    @PostMapping("/add-contrat")
    public Contrat saveContrat(@RequestBody Contrat contrat){
        return contratService.saveContrat(contrat);
    }
    @PutMapping("/update-contrat/{contratId}")
    public Contrat updateContrat(@PathVariable Long contratId, @RequestBody Contrat contrat){
        contrat.setId(contratId);
        return contratService.updateContrat(contrat);
    }
    @DeleteMapping("contrat/{id}")
    public void deleteContrat(@PathVariable Long id){
        contratService.deleteContrat(id);
    }




}
