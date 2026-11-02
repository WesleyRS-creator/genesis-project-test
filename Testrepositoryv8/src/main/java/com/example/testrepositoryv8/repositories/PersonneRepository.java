package com.example.testrepositoryv8.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.testrepositoryv8.models.Personne;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PersonneRepository extends JpaRepository<Personne, Integer>, JpaSpecificationExecutor<Personne> {

}
