package com.example.frontendconnectswithBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Course {
    @Id
    private int course_id;
    private String course_name;
    private String location;
}
