package com.example.JPADemo.controller;
import com.example.JPADemo.model.Student;
import com.example.JPADemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{rno}")
    public Student getStudentByRno(@PathVariable("rno") int roll){
       return studentService.getStudentByRno(roll);
    }

    @PostMapping("/students")
    public String addStudents(@RequestBody Student student){
        studentService.addStudents(student);
        return "added";
    }
    @PutMapping("/students")
    public String updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
        return "updated";
    }

    @DeleteMapping("/students/{rno}")
    public String deleteStudentByRno(@PathVariable("rno") int roll){
        studentService.deleteStudentByRno(roll);
        return "deleted";
    }
    @DeleteMapping("/students/clear")
    public String clearStudents(){
        studentService.claerStudents();
        return "clear All";
    }
}
