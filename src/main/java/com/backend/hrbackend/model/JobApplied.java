package com.backend.hrbackend.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class JobApplied {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long jobAppliedId;
    
}
