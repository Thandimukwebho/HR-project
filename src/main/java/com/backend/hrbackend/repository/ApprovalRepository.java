package com.backend.hrbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.hrbackend.model.Approval;

@Repository
public interface ApprovalRepository extends JpaRepository<Approval, Long> {
    
}
