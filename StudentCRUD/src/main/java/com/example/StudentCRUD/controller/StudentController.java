package com.example.StudentCRUD.controller;


import com.example.StudentCRUD.model.Student;
import com.example.StudentCRUD.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("students")
    public List<Student> getStudent() {
        return studentService.getStudents();
    }

    @GetMapping("students/{rno}")
    public Student getStudentByRno(@PathVariable("rno") int rollno){
        return studentService.getStuByRno(rollno);
    }
    @PostMapping("students")
    public String addStudents(@RequestBody Student student){
        studentService.addStudent(student);
        return "sucess";
    }


}
