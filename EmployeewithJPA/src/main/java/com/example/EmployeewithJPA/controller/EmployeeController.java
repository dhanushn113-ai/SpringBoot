package com.example.EmployeewithJPA.controller;


import com.example.EmployeewithJPA.model.Employee;
import com.example.EmployeewithJPA.service.EmployeeService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    @GetMapping("employee")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("employee/{age}")
    public  List<Employee> getEmployeeByAge(@PathVariable("age") int age){
        return employeeService.getEmployeeByAge(age);
    }
    @PostMapping("employee")
    public String addEmployees(@RequestBody Employee employee){
        employeeService.addEmployees(employee);
        return "employees added";
    }
    @PutMapping("employee")
    public String updateEmployee(@RequestBody Employee employee){
        employeeService.updateEmployee(employee);
        return "updated";
    }
    @DeleteMapping("employee/{id}")
    public String deleteEmployeeById(@PathVariable("id") int id) {
       employeeService.deleteEmployeeBYid(id);
       return "deleted";
    }
    @DeleteMapping("employee/clear")
    public String deleteAllEmployee(@RequestBody Employee employee){
        employeeService.deleteAllEmployee(employee);
        return "All Employees  are deleted";
    }
}
