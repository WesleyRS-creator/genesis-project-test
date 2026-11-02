package com.example.testrepositoryv8.services.interfaces;

import com.example.testrepositoryv8.models.Participer;
import com.example.testrepositoryv8.models.dto.ParticiperSearch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;    
import java.util.List;


public interface ParticiperService {
    Page<Participer> getAllParticiper(Pageable pageable);

    Page<Participer> getAllParticiper(Pageable pageable, ParticiperSearch object);

    Participer getParticiperById(Integer id);

    public String exportParticiperToCSV(List<Participer> participer);

    

    Participer createParticiper(Participer participer);

    Participer updateParticiper(Integer id, Participer participer);

    void deleteParticiper(Integer id);
    

}
