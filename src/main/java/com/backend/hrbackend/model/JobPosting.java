package com.backend.hrbackend.model;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.*;

@Entity
public class JobPosting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long jobPostingId;
    private String jobSector;
    private String jobTitle;
    private String jobDescription;
    private float jobSalary;
    private String type;
    private String responsibilities;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Date jobDeadline;

    public long getJobPostingId() {
        return this.jobPostingId;
    }

    public void setJobPostingId(long jobPostingId) {
        this.jobPostingId = jobPostingId;
    }

    public String getJobSector() {
        return this.jobSector;
    }

    public void setJobSector(String jobSector) {
        this.jobSector = jobSector;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return this.jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public float getJobSalary() {
        return this.jobSalary;
    }

    public void setJobSalary(float jobSalary) {
        this.jobSalary = jobSalary;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getResponsibilities() {
        return this.responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    public Date getJobDeadline() {
        return this.jobDeadline;
    }

    public void setJobDeadline(Date jobDeadline) {
        this.jobDeadline = jobDeadline;
    }

}
