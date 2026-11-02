package com.example.testrepositoryv8.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.testrepositoryv8.models.Participer;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import com.example.testrepositoryv8.models.Personne;
import com.example.testrepositoryv8.models.Projet;



public interface ParticiperRepository extends JpaRepository<Participer, Integer>, JpaSpecificationExecutor<Participer> {

List<Participer> findByIdpersonnePersonne(Personne idpersonnePersonne);
List<Participer> findByIdprojetProjet(Projet idprojetProjet);



}
