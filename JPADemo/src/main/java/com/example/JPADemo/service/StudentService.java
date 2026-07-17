package com.example.JPADemo.service;
import com.example.JPADemo.model.Student;
import com.example.JPADemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    public void addStudents(Student student) {
        studentRepository.save(student);
    }
    public void updateStudent(Student student) {
        studentRepository.save(student);
    }
    public Student getStudentByRno(int roll) {
        return studentRepository.findById(roll).orElse(new Student());
    }
    public void deleteStudentByRno(int roll) {
        studentRepository.deleteById(roll);
    }
    public void claerStudents() {
        studentRepository.deleteAll();
    }
}
