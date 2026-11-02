package com.example.testrepositoryv8.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;      
import org.springframework.data.jpa.domain.Specification;
import com.example.testrepositoryv8.models.VFicheCompletePersonne;
import com.example.testrepositoryv8.models.dto.VFicheCompletePersonneSearch;
import org.springframework.stereotype.Service;
import com.example.testrepositoryv8.repositories.VFicheCompletePersonneRepository;
import java.util.Optional;
import com.example.testrepositoryv8.services.interfaces.VFicheCompletePersonneService;
import com.example.testrepositoryv8.specification.VFicheCompletePersonneSpecification;
import com.example.testrepositoryv8.exception.ResourceNotFoundException;
import com.example.testrepositoryv8.exception.InternalServerErrorException;
import com.example.testrepositoryv8.utils.ExportUtils;
import org.springframework.dao.DataIntegrityViolationException;
import java.util.List;


@Service
public class DefaultVFicheCompletePersonneService implements VFicheCompletePersonneService {
	private final VFicheCompletePersonneRepository vFicheCompletePersonneRepository;

	public DefaultVFicheCompletePersonneService(VFicheCompletePersonneRepository vFicheCompletePersonneRepository) {
	   this.vFicheCompletePersonneRepository = vFicheCompletePersonneRepository;
	}

	@Override
	public String exportVFicheCompletePersonneToCSV(List<VFicheCompletePersonne> vFicheCompletePersonne) {
	   return ExportUtils.generateCsv(vFicheCompletePersonne);
	}  

	@Override
	public Page<VFicheCompletePersonne> getAllVFicheCompletePersonne(Pageable pageable) {
	    try {
	        return vFicheCompletePersonneRepository.findAll(pageable);
	    } catch (Exception ex) {
	        throw new InternalServerErrorException("Error while retrieving v fiche complete personne", ex);
	    }
	}

	@Override
	public Page<VFicheCompletePersonne> getAllVFicheCompletePersonne(Pageable pageable, VFicheCompletePersonneSearch object) {
	    try {
	        Specification<VFicheCompletePersonne> spec=VFicheCompletePersonneSpecification.filter(object);
	        return vFicheCompletePersonneRepository.findAll(spec, pageable);
	    } catch (Exception ex) {
	        throw new InternalServerErrorException("Error while retrieving v fiche complete personne", ex);
	    }
	}

	@Override
	public VFicheCompletePersonne getVFicheCompletePersonneById(Integer idPersonne) {
	    Optional<VFicheCompletePersonne> vFicheCompletePersonne = vFicheCompletePersonneRepository.findById(idPersonne);
	    if (vFicheCompletePersonne.isPresent()) {
	        return vFicheCompletePersonne.get();
	    } else {
	        throw new ResourceNotFoundException("VFicheCompletePersonne not found with idPersonne : " + idPersonne);
	    }
	}






}
