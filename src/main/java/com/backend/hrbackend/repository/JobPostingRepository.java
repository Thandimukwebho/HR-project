package com.backend.hrbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.hrbackend.model.JobPosting;



public interface JobPostingRepository extends JpaRepository<JobPosting,Long>{
    public JobPosting findByJobPostingId(long jobPostingId); 
}
