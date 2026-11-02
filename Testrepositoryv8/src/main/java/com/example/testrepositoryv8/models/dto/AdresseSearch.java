package com.example.testrepositoryv8.models.dto;

import lombok.Getter;
import lombok.Setter;
import com.example.testrepositoryv8.models.Personne;



@Getter @Setter
public class AdresseSearch {

	private Integer id;

	private Personne idpersonnePersonne;
	
	private Double latitude;
	private Double latitudeMin;
	private Double latitudeMax;

	private String codePostal;
	private String ville;
	private String rue;
	
}
