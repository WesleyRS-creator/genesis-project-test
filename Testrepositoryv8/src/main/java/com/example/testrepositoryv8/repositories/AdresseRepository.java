package com.example.testrepositoryv8.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.testrepositoryv8.models.Adresse;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import com.example.testrepositoryv8.models.Personne;



public interface AdresseRepository extends JpaRepository<Adresse, Integer>, JpaSpecificationExecutor<Adresse> {

List<Adresse> findByIdpersonnePersonne(Personne idpersonnePersonne);



}
