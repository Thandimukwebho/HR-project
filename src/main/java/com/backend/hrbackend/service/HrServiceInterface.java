package com.backend.hrbackend.service;

import java.util.List;

import com.backend.hrbackend.model.Applicant;
import com.backend.hrbackend.model.JobPosting;
import com.backend.hrbackend.model.JobRequisition;
public interface HrServiceInterface {
    //Applicant
    public List<Applicant> getAllApplicant();
    public String createApplicant(Applicant applicant);
    public Applicant getApplicant(long id);
    public Applicant updateApplicant(Applicant applicant);
    public boolean login(String email,String password);

    //JobPosting 
    public String createJobPosting(JobPosting jobPosting);
    public JobPosting getJobPosting(long id);
    public List<JobPosting> getAllJobPostings();
    
    //Job Requisition

    public JobRequisition createJobRequisition(JobRequisition jobRequisition);
    public JobRequisition getRequisition(long id);
}
