package com.backend.hrbackend.model;
import java.util.Date;

import jakarta.persistence.*;

@Entity
public class Approval {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long approvalId;
private String decision;
private String reason;
private Date ApprovalDate;
private String signature;

public long getApprovalId() {
    return this.approvalId;
}

public void setApprovalId(long approvalId) {
    this.approvalId = approvalId;
}

public String getDecision() {
    return this.decision;
}

public void setDecision(String decision) {
    this.decision = decision;
}

public String getReason() {
    return this.reason;
}

public void setReason(String reason) {
    this.reason = reason;
}

public Date getApprovalDate() {
    return this.ApprovalDate;
}

public void setApprovalDate(Date ApprovalDate) {
    this.ApprovalDate = ApprovalDate;
}

public String getSignature() {
    return this.signature;
}

public void setSignature(String signature) {
    this.signature = signature;
}



}
