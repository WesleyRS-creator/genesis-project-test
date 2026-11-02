package com.example.testrepositoryv8.services.interfaces;

import com.example.testrepositoryv8.models.VFicheCompletePersonne;
import com.example.testrepositoryv8.models.dto.VFicheCompletePersonneSearch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;    
import java.util.List;


public interface VFicheCompletePersonneService {
    Page<VFicheCompletePersonne> getAllVFicheCompletePersonne(Pageable pageable);

    Page<VFicheCompletePersonne> getAllVFicheCompletePersonne(Pageable pageable, VFicheCompletePersonneSearch object);

    VFicheCompletePersonne getVFicheCompletePersonneById(Integer idPersonne);

    public String exportVFicheCompletePersonneToCSV(List<VFicheCompletePersonne> vFicheCompletePersonne);


}
