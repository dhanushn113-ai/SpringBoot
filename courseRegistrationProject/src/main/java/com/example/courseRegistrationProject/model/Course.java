package com.example.courseRegistrationProject.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import   lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Course {

    @Id
    private int course_id;
    private String course_name;
    private String trainer;
    private int durationInWeek;
}
