package com.example.EmployeeManagementCRUD.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private int id;
    private String name;
    private String Location;
    private double salary;
    private String department;

}
