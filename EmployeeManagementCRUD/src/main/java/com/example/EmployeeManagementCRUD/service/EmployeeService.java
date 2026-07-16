package com.example.EmployeeManagementCRUD.service;


import com.example.EmployeeManagementCRUD.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {


    static List<Employee> employee = new ArrayList<>(
            Arrays.asList(
                    new Employee(1,"dhanush","Chennai",200000,"computerScience"),
                    new Employee(2,"Preethi","hyderabad",300000,"Ai"),
                    new Employee(3,"vijay","bengaluru",400000,"mechanical"),
                    new Employee(4,"ajith","kanayakumari",300000,"electronics")
            )
    );

    public List<Employee> getEmployees() {
        return employee;
    }

    public Employee getEmployeeById(int id) {
        int index = 0;
        boolean found = false;
        for(int i = 0; i < employee.size();i++){
            if(employee.get(i).getId()==id){
                index = i;
                found=true;
                break;

            }
        }
        if(found){
            return employee.get(index);
        }else{
            return new Employee(0,"","",0,"");
        }

    }
//
//    public Employee getEmployeeByName(String name) {
//
//        for (Employee emp : employee) {
//            if (emp.getName().equalsIgnoreCase(name)) {
//                return emp;
//            }
//        }
//
//        throw new RuntimeException("Employee Not Found");
//    }

    public static void addEmployees(Employee employeee) {
        employee.add(employeee);
    }


    public String updateEmployee(Employee employeee) {
        int index = 0;
        boolean found = false;
        for(int i = 0; i < employee.size();i++){
            if(employee.get(i).getId()==employeee.getId()){
                index = i;
                found = true;
                break;
            }
        }
        if(!found){
            return "No such employee exists";
        }else{
            employee.set(index,employeee);
            return "updation is done";

        }

    }

    public String deleteEmplyee(int id) {
        int index = 0;
        boolean found = false;
        for(int i = 0; i < employee.size();i++){
            if(employee.get(i).getId()==id){
                index = i;
                found = true;
                break;

            }

        }
        if(found){
            employee.remove(index);
            return "delete";
        }else{
            return "emloyee does not exist";
        }
    }
}
