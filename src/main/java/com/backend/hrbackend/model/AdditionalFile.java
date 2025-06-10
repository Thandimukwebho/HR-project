package com.backend.hrbackend.model;

import jakarta.persistence.*;

@Entity
public class AdditionalFile {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long addId;
private String fileName;
private String filePath;

public String getFileName() {
    return this.fileName;
}

public void setFileName(String fileName) {
    this.fileName = fileName;
}

public String getFilePath() {
    return this.filePath;
}

public void setFilePath(String filePath) {
    this.filePath = filePath;
}

}
