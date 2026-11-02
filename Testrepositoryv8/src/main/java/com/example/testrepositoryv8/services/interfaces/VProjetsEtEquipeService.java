package com.example.testrepositoryv8.services.interfaces;

import com.example.testrepositoryv8.models.VProjetsEtEquipe;
import com.example.testrepositoryv8.models.dto.VProjetsEtEquipeSearch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;    
import java.util.List;


public interface VProjetsEtEquipeService {
    Page<VProjetsEtEquipe> getAllVProjetsEtEquipe(Pageable pageable);

    Page<VProjetsEtEquipe> getAllVProjetsEtEquipe(Pageable pageable, VProjetsEtEquipeSearch object);

    VProjetsEtEquipe getVProjetsEtEquipeById(Integer idProjet);

    public String exportVProjetsEtEquipeToCSV(List<VProjetsEtEquipe> vProjetsEtEquipe);


}
