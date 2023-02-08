package com.example.kaddem.entities;

import com.example.kaddem.enums.Niveau;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomEquipe;
    private Niveau niveau;
    @ManyToMany(mappedBy = "equipe", fetch = FetchType.LAZY)
    private List<Etudiant> etudiant;
    @OneToOne
    private DetailEquipe detailEquipe;
}
