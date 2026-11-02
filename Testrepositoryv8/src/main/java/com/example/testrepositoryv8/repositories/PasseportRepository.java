package com.example.testrepositoryv8.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.testrepositoryv8.models.Passeport;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import com.example.testrepositoryv8.models.Personne;



public interface PasseportRepository extends JpaRepository<Passeport, Integer>, JpaSpecificationExecutor<Passeport> {

List<Passeport> findByIdpersonnePersonne(Personne idpersonnePersonne);



}
