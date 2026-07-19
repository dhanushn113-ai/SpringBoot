package com.example.courseRegistrationProject.controller;


import com.example.courseRegistrationProject.model.Course;
import com.example.courseRegistrationProject.model.CourseRegestry;
import com.example.courseRegistrationProject.service.CourseService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("course")
    public List<Course> getAllCourse(){
        return courseService.getAllCourse();
    }
    @GetMapping("course/enrolled")
    private List<CourseRegestry> getAllRegestries(){
        return courseService.getAllRegestries();
    }
    @PostMapping("/course/regester")
    public  String enrollStudents(@RequestParam("candidate_name") String name,
                                  @RequestParam("email_id") String email,
                                  @RequestParam("courseName") String courseName){
        courseService.enrollStudents(name,email,courseName);
        return "congratulation " +name+  "  enrolled successfully for " + courseName;
    }
    @DeleteMapping("course/{id}")
    public String deleteById(@PathVariable("id") int id){
        courseService.deleteById(id);
        return "deleted";
    }




}
