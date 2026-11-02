package com.example.testrepositoryv8.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.testrepositoryv8.models.VProjetsEtEquipe;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface VProjetsEtEquipeRepository extends JpaRepository<VProjetsEtEquipe, Integer>, JpaSpecificationExecutor<VProjetsEtEquipe> {

}
