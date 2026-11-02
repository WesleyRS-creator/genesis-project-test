package com.example.testrepositoryv8.models.dto;

import lombok.Getter;
import lombok.Setter;
import com.example.testrepositoryv8.models.Personne;



@Getter @Setter
public class PasseportSearch {

	private java.time.LocalDate dateExpiration;
	private java.time.LocalDate dateExpirationMin;
	private java.time.LocalDate dateExpirationMax;

	private Integer id;

	private Personne idpersonnePersonne;
	
	private String numero;
	
}
