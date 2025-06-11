package com.backend.hrbackend.controller;

import com.backend.hrbackend.model.Approval;
import com.backend.hrbackend.service.HrServiceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/approval")
@CrossOrigin
public class ApprovalController {

    @Autowired
    private HrServiceImplementation approvalService;

    @GetMapping("/getAll")
    public List<Approval> getAllApprovals() {
        return approvalService.getAllApprovals();
    }

    @GetMapping("/getApproval/{id}")
    public Approval getApproval(@PathVariable long id) {
        return approvalService.getApproval(id);
    }

    @PostMapping("/createApproval")
    public Approval postMethodName(@RequestBody Approval approval) {
        return approvalService.createApproval(approval);
    }

    @PutMapping("/updateApproval/{id}")
    public Approval updateApproval(@PathVariable long id, @RequestBody Approval approval) {
        return approvalService.updateApproval(id, approval);
    }

    @DeleteMapping("/deleteApproval/{id}")
    public String deleteApproval(@PathVariable long id) {
        approvalService.getApproval(id);
        return "Approval with ID " + id + " deleted successfully.";
    }
}
