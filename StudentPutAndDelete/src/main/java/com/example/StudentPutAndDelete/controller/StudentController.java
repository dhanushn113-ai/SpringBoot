package com.example.StudentPutAndDelete.controller;



import com.example.StudentPutAndDelete.model.Student;
import com.example.StudentPutAndDelete.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {


    @Autowired
    StudentService studentServise;


    @GetMapping("students")
    public List<Student> getStudents(){
        return studentServise.getStudents();

    }
    @GetMapping("students/{rno}")
    public Student getStudentByrno(@PathVariable("rno") int roll){
        return studentServise.getStudentByRoll(roll);
    }

    @PostMapping("students")
    public String addStudent(@RequestBody Student student){
        StudentService.addStudent(student);
        return "success";
    }
    @PutMapping("students")
    public String updateStudent(@RequestBody Student student){
        return studentServise.updateStudents(student);
    }
    @DeleteMapping("students/{rno}")
    public String deleteStudent(@PathVariable int roll){
       return studentServise.deleteStudent(roll);
    }


}

