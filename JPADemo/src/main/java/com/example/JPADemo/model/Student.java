package com.example.JPADemo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {

    @Id
    private int rno;
    private String name;
    private String gender;
    private String technology;


}
