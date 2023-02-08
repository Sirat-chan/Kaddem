package com.example.kaddem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomUniversite;
/*    @OneToMany (mappedBy = "universite", fetch = FetchType.LAZY)
    private List<Departement> departement;*/
}
