package com.example.testrepositoryv8.services.interfaces;

import com.example.testrepositoryv8.models.Projet;
import com.example.testrepositoryv8.models.dto.ProjetSearch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;    
import java.util.List;


public interface ProjetService {
    Page<Projet> getAllProjet(Pageable pageable);

    Page<Projet> getAllProjet(Pageable pageable, ProjetSearch object);

    Projet getProjetById(Integer id);

    public String exportProjetToCSV(List<Projet> projet);

    

    Projet createProjet(Projet projet);

    Projet updateProjet(Integer id, Projet projet);

    void deleteProjet(Integer id);
    

}
