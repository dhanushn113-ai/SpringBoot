package com.example.frontendconnectswithBackend.service;


import com.example.frontendconnectswithBackend.model.Course;
import com.example.frontendconnectswithBackend.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    
    
    @Autowired
    CourseRepository courseRepository;

    public List<Course> getAllCourse() {
        return courseRepository.findAll();
    }

    public void addCourses(Course course) {
        courseRepository.save(course);
    }
    public void addCourse(int id, String name, String location) {
        Course course = new Course();
        course.setCourse_id(id);
        course.setCourse_name(name);
        course.setLocation(location);
        courseRepository.save(course);
    }
}
