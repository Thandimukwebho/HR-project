package com.backend.hrbackend.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.hrbackend.model.Applicant;
import com.backend.hrbackend.model.Approval;
import com.backend.hrbackend.model.JobPosting;
import com.backend.hrbackend.model.JobRequisition;
import com.backend.hrbackend.repository.AdditoinalFileRepository;
import com.backend.hrbackend.repository.ApplicantRepository;
import com.backend.hrbackend.repository.ApprovalRepository;
import com.backend.hrbackend.repository.JobPostingRepository;
import com.backend.hrbackend.repository.JobRequisitionRepository;

@Service
public class HrServiceImplementation implements HrServiceInterface{
     @Autowired
     ApplicantRepository applicantRepository;
     @Autowired
     JobPostingRepository jobPostingRepository;

     @Autowired
     JobRequisitionRepository jobRequisitionRepository;

     @Autowired
     ApprovalRepository approvalRepository;
     @Autowired
     AdditoinalFileRepository additoinalFileRepository;

     public List<Applicant> getAllApplicant(){
        return applicantRepository.findAll();
     }
    public String createApplicant(Applicant applicant){
         applicantRepository.save(applicant);
         return "Saved"; 
    }
    public Applicant getApplicant(long id){
       return applicantRepository.findByApplicantId(id);
    }
    public Applicant updateApplicant(Applicant applicant){
       return applicantRepository.save(applicant);
    }
    public boolean login(String email,String password){
        return applicantRepository.findByEmailAndPassword(email,password);
    }
    @Override
    public String createJobPosting(JobPosting jobPosting) {
        jobPostingRepository.save(jobPosting);
        return "Job Created";
    }
    @Override
    public JobPosting getJobPosting(long id) {
        return jobPostingRepository.findByJobPostingId(id);
    }
    @Override
    public List<JobPosting> getAllJobPostings() {
        return jobPostingRepository.findAll();
    }
    @Override
    public JobRequisition createJobRequisition(JobRequisition jobRequisition) {
      return jobRequisitionRepository.save(jobRequisition);
    }
    @Override
    public JobRequisition getRequisition(long id) {
      return jobRequisitionRepository.findByJobRequisitionId(id);
    }
      @Autowired
    public void ApprovalServiceImpl(ApprovalRepository approvalRepository) {
        this.approvalRepository = approvalRepository;
    }

    @Override
    public List<Approval> getAllApprovals() {
        return approvalRepository.findAll();
    }

    @Override
    public Approval getApproval(long id) {
        return approvalRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Approval not found with id " + id));
    }

    @Override
    public Approval createApproval(Approval approval) {
        return approvalRepository.save(approval);
    }

    @Override
    public Approval updateApproval(long id, Approval approval) {
                // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAdditionalFileName'");
    }

    @Override
    public void deleteApproval(long id) {
        approvalRepository.deleteById(id);
    }
    @Override
    public String getAdditionalFileName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAdditionalFileName'");
    }
    @Override
    public void setAdditionalFileName(String fileName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAdditionalFileName'");
    }
    @Override
    public String getAdditionalFilePath() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAdditionalFilePath'");
    }
    @Override
    public void setAdditionalFilePath(String filePath) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAdditionalFilePath'");
    }
     
    
}
