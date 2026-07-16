package com.example.EmployeeManagementCRUD.controller;

import com.example.EmployeeManagementCRUD.model.Employee;
import com.example.EmployeeManagementCRUD.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("employes")
    public List<Employee> getEmplyee(){
        return employeeService.getEmployees();
    }
    @GetMapping("employes/{id}")
    public Employee getEmployeeById(@PathVariable("id") int id){
        return employeeService.getEmployeeById(id);
    }
//    @GetMapping("/employes/{name}")
//    public Employee getEmployeeByName(@PathVariable String name) {
//        return employeeService.getEmployeeByName(name);
//    }

    @PostMapping("employes")
    public String addEmployee(@RequestBody Employee employeee){
        employeeService.addEmployees(employeee);
        return "sucess";
    }

    @PutMapping("employes")
    public String updateEmployee(@RequestBody Employee employeee){
         return employeeService.updateEmployee(employeee);

    }
    @DeleteMapping("employes/{id}")
    public String  deleteEmployee(@PathVariable int id){
        return employeeService.deleteEmplyee(id);
    }
}
