package com.example.courseRegistrationProject.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class CourseRegestry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String candidate_name;
    private String email_id;
    private String courseName;

    public CourseRegestry( String candidate_name, String email_id, String courseName) {
        this.candidate_name = candidate_name;
        this.email_id = email_id;
        this.courseName = courseName;
    }
}
