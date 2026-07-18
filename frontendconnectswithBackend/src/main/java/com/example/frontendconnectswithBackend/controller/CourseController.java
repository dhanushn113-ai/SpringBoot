package com.example.frontendconnectswithBackend.controller;


import com.example.frontendconnectswithBackend.model.Course;
import com.example.frontendconnectswithBackend.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("course")
    public List<Course> getAllCourses(){
        return courseService.getAllCourse();
    }
    @PostMapping("course")
    public ResponseEntity<String> addCourses(@RequestBody Course course){
        courseService.addCourses(course);
        return new ResponseEntity<>("Added", HttpStatus.CREATED);
    }

    @PostMapping("add/course")
    public void addCourse(@RequestParam("course_id") int id,
                          @RequestParam("course_name") String name,
                          @RequestParam("location") String location){
        courseService.addCourse(id,name,location);
    }
}
