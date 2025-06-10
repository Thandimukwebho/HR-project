package com.backend.hrbackend.model;

import jakarta.persistence.*;

@Entity
public class JobRequisition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long jobRequisitionId;
    private String jobSector;
    private String jobTitle;
    private String jobDescription;
    private float jobSalary;
    private String type;
    private String responsibilities;
    private String NumPosition;
    private String Approved;
    private String Justification;

    public long getJobRequisitionId() {
        return this.jobRequisitionId;
    }

    public void setJobRequisitionId(long jobRequisitionId) {
        this.jobRequisitionId = jobRequisitionId;
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

    public String getNumPosition() {
        return this.NumPosition;
    }

    public void setNumPosition(String NumPosition) {
        this.NumPosition = NumPosition;
    }

    public String getApproved() {
        return this.Approved;
    }

    public void setApproved(String Approved) {
        this.Approved = Approved;
    }

    public String getJustification() {
        return this.Justification;
    }

    public void setJustification(String Justification) {
        this.Justification = Justification;
    }

}
