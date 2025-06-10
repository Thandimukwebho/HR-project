package com.backend.hrbackend.model;

import jakarta.persistence.*;

@Entity
public class Qualification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long qualificationId;
}
