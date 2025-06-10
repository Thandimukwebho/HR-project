package com.backend.hrbackend.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Applicant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long applicantId;
    private String name;
    private String surname;
    private String email;
    private String password;
    
     @JsonInclude(JsonInclude.Include.NON_NULL)
    private int age;
     @JsonInclude(JsonInclude.Include.NON_NULL)
    private String gender;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String idNumber;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String passport;
    
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="fkApplicantId",referencedColumnName = "applicantId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<ApplicantSkill> skills;
    
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="fkApplicantId",referencedColumnName = "applicantId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Qualification> qualifications;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="fkApplicantId",referencedColumnName = "applicantId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<JobApplied> jobsApplied;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="fkApplicantId",referencedColumnName = "applicantId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<AdditionalFile> AdditionalFiles;


    public Applicant() {
   
}
    public long getApplicantId() {
        return this.applicantId;
    }

    public void setApplicantId(long applicantId) {
        this.applicantId = applicantId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdNumber() {
        return this.idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPassport() {
        return this.passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

}
