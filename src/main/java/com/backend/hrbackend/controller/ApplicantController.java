package com.backend.hrbackend.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.backend.hrbackend.model.Applicant;
import com.backend.hrbackend.service.HrServiceImplementation;

@RestController
@RequestMapping("/applicant")
@CrossOrigin 
public class ApplicantController {
@Autowired
private HrServiceImplementation hrservice;

    @GetMapping("/getAllApplicant")
  public List<Applicant> getAllApplicant(){
    return hrservice.getAllApplicant();
     }

     @PostMapping("/createApplicant")
    public String createApplicant(@RequestBody Applicant applicant){
        return hrservice.createApplicant(applicant);
    }
    @GetMapping("/getApplicant/{id}")
    public Applicant getApplicant(@PathVariable long id){
        return hrservice.getApplicant(id);
    }

    @PutMapping("/updateApplicant")
    public Applicant updateApplicant(@RequestBody Applicant applicant){
        return hrservice.updateApplicant(applicant);
    }

    @GetMapping("/login")
    public boolean login(@RequestParam String email,@RequestParam String password){
       return hrservice.login(email,password);
    }

}
