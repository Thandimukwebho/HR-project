package com.backend.hrbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.hrbackend.model.Prescreening;


public interface PrescreeningRepository extends JpaRepository<Prescreening,Long>{
    
}
