package com.example.testrepositoryv8.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.testrepositoryv8.models.VFicheCompletePersonne;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface VFicheCompletePersonneRepository extends JpaRepository<VFicheCompletePersonne, Integer>, JpaSpecificationExecutor<VFicheCompletePersonne> {

}
