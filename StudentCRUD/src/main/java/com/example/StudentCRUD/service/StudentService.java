package com.example.StudentCRUD.service;

import com.example.StudentCRUD.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

        List<Student> students = new ArrayList<>(
                Arrays.asList(
                        new Student(1,"anbu","java"),
                        new Student(2,"preethi,","python")

                )
        );

    public List<Student> getStudents(){
        return students;

    }
    public Student getStuByRno(int rollno) {
        int index = 0;
        for(int i = 0; i < students.size();i++){
            if(students.get(i).getRno() == rollno){
                index = i;
            }
        }
        return students.get(index);
    }


    public void addStudent(Student student) {
        students.add(student);
    }
}
