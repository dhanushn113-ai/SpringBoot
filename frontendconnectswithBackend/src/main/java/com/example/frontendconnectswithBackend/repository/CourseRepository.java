package com.example.frontendconnectswithBackend.repository;


import com.example.frontendconnectswithBackend.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {


}
