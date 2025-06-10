package com.backend.hrbackend.model;

import jakarta.persistence.*;

@Entity
public class Prescreening {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long preScreeningId;
}
