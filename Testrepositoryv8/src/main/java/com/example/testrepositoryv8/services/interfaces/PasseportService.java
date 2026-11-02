package com.example.testrepositoryv8.services.interfaces;

import com.example.testrepositoryv8.models.Passeport;
import com.example.testrepositoryv8.models.dto.PasseportSearch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;    
import java.util.List;


public interface PasseportService {
    Page<Passeport> getAllPasseport(Pageable pageable);

    Page<Passeport> getAllPasseport(Pageable pageable, PasseportSearch object);

    Passeport getPasseportById(Integer id);

    public String exportPasseportToCSV(List<Passeport> passeport);

    

    Passeport createPasseport(Passeport passeport);

    Passeport updatePasseport(Integer id, Passeport passeport);

    void deletePasseport(Integer id);
    

}
