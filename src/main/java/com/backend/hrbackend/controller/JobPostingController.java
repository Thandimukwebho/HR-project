package com.backend.hrbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.backend.hrbackend.model.JobPosting;
import com.backend.hrbackend.service.HrServiceImplementation;



@RestController
@RequestMapping("/jobPosting")
@CrossOrigin 
public class JobPostingController {
@Autowired
private HrServiceImplementation hr;

@GetMapping("/getAll")
public List<JobPosting> getAllJobPostings() {
    return hr.getAllJobPostings();
}
@GetMapping("/getJobPost/{id}")
public JobPosting getJobPosting(@PathVariable long id) {
    return hr.getJobPosting(id);
}
@PostMapping("/createJob")
public String postMethodName(@RequestBody JobPosting jobPosting) {
    return hr.createJobPosting(jobPosting);
}

}
