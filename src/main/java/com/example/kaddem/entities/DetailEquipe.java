package com.example.kaddem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class DetailEquipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long salle;
    private String thématique;
    @OneToOne(mappedBy = "detailEquipe", fetch = FetchType.LAZY)
    private Equipe equipe;
}
