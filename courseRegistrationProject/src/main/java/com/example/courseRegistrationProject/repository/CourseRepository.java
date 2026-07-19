package com.example.courseRegistrationProject.repository;

import com.example.courseRegistrationProject.model.Course;
import com.example.courseRegistrationProject.model.CourseRegestry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {
}
