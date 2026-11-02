package com.example.testrepositoryv8.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.testrepositoryv8.models.VSynthetiseGlobal;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface VSynthetiseGlobalRepository extends JpaRepository<VSynthetiseGlobal, Integer>, JpaSpecificationExecutor<VSynthetiseGlobal> {

}
