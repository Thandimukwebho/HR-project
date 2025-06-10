package com.backend.hrbackend.model;
import jakarta.persistence.*;

@Entity
public class ApplicantSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long applicantSkiillId;
    
}
