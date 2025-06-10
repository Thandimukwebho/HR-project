package com.backend.hrbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.backend.hrbackend.model.JobRequisition;
import com.backend.hrbackend.service.HrServiceImplementation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/jobRequisition")
@CrossOrigin 
public class JobRequisitionController {
    
    @Autowired
private HrServiceImplementation hr;

@GetMapping("/getJobRequisition/{id}")
public JobRequisition getJobRequisition(@PathVariable long id) {
    return hr.getRequisition(id);
}

@PostMapping("/createJobRequisition")
public JobRequisition postMethodName(@RequestBody JobRequisition jobRequisition) {
    return hr.createJobRequisition(jobRequisition);
}

}
