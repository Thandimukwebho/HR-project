package com.backend.hrbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.hrbackend.model.Applicant;

public interface ApplicantRepository extends JpaRepository<Applicant,Long>{

    public boolean findByEmailAndPassword(String email,String password);
    public Applicant findByApplicantId(long applicantId);
} 