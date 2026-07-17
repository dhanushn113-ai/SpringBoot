package com.example.EmployeewithJPA.service;


import com.example.EmployeewithJPA.model.Employee;
import com.example.EmployeewithJPA.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();

    }

    public List<Employee> getEmployeeByAge(int age) {
        return employeeRepository.findByAge(age);
    }

    public void addEmployees(Employee employee) {
        employeeRepository.save(employee);
    }

    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void deleteEmployeeBYid(int id) {
        employeeRepository.deleteById(id);
    }

    public void deleteAllEmployee(Employee employee) {
        employeeRepository.deleteAll();
    }
}
