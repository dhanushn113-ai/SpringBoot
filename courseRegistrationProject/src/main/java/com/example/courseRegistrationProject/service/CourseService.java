package com.example.courseRegistrationProject.service;


import com.example.courseRegistrationProject.model.Course;
import com.example.courseRegistrationProject.model.CourseRegestry;
import com.example.courseRegistrationProject.repository.CourseRegestryRepository;
import com.example.courseRegistrationProject.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CourseRegestryRepository courseRegestryRepository;

    public List<Course> getAllCourse() {
        return courseRepository.findAll();
    }
    public List<CourseRegestry> getAllRegestries() {
        return courseRegestryRepository.findAll();
    }
    public void enrollStudents(String name, String email, String courseName) {
        CourseRegestry courseRegestry = new CourseRegestry(name, email, courseName);
        courseRegestryRepository.save(courseRegestry);

    }


    public void deleteById(int id) {
        courseRegestryRepository.deleteById(id);
    }
}
