package com.example.kaddem;

import com.example.kaddem.entities.Contrat;
import com.example.kaddem.entities.Etudiant;
import com.example.kaddem.enums.Option;
import com.example.kaddem.repositories.ContratRepository;
import com.example.kaddem.repositories.DepartementRepository;
import com.example.kaddem.repositories.EtudiantRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Slf4j
@RestController
@SpringBootApplication
public class KaddemApplication {
    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }
    public static void main(String[] args) {
        SpringApplication.run(KaddemApplication.class, args);
    }
    @Bean
    CommandLineRunner start(EtudiantRepository etudiantRepository,
                            DepartementRepository departementRepository,
                            ContratRepository contratRepository){
        return args ->{
/*
          *//*  Contrat contrat = new Contrat();
         //  log.info(etudiantRepository.findByNomEtudiant("Oussama").toString());
         //   contrat.setEtudiant(etudiantRepository.findByNomEtudiant(""));
            contrat.setSpecialite(Specialite.IA);
            contrat.setDateDebutContrat(new Date(2009,7,1));
            contrat.setDateFinContrat(new Date(2013,9,24));
            contratRepository.save(contrat);*//*
            List<Contrat> contracts = new ArrayList<>();
            contracts.add(contratRepository.findById(17L).orElse(null));
            contracts.add(contratRepository.findById(16L).orElse(null));
            contratRepository.findById(17L).orElse(null).setEtudiant(etudiantRepository.findById(33L).orElse(null));
           // etudiantRepository.findByNomEtudiant("Oussama").setContrat(contracts);
           // log.info(contratRepository.findAll().toString());
            Stream.of("Sirat","Oussama").forEach(name->{
                Etudiant etudiant = new Etudiant();
                etudiant.setNomEtudiant(name);
                etudiant.setPrenomEtudiant("Ben Jemaa");
                etudiant.setOption(Option.SE);
                etudiant.setEmail(name+"@gmail.com");
                etudiant.setContrat(contracts);
                contratRepository.findById(16L).orElse(null).setEtudiant(etudiant);

                etudiantRepository.save(etudiant);*/

           // });
          //  etudiantRepository.findAll();
           // log.info(etudiantRepository.findByNomEtudiant("Oussama").toString());
        //    log.info(etudiantRepository.findAll().toString());
        };




    }

}
