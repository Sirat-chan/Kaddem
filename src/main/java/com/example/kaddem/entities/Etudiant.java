package com.example.kaddem.entities;

import com.example.kaddem.enums.Option;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String prenomEtudiant;
    private String nomEtudiant;
    private String email;
    //@Enumerated(EnumType.STRING)
    private Option option;
    @OneToMany(mappedBy = "etudiant")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Contrat> contrat;
     @ManyToOne
    private Departement departement;
    @ManyToMany
    private List<Equipe> equipe;

}
