package com.backend.hrbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.hrbackend.model.JobRequisition;


public interface JobRequisitionRepository extends JpaRepository<JobRequisition,Long>{
public JobRequisition  findByJobRequisitionId(long jobRequisitionId);
}
