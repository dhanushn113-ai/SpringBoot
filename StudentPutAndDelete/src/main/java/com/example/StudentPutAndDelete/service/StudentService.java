package com.example.StudentPutAndDelete.service;


import com.example.StudentPutAndDelete.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {


    static List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1,"Anbu","python"),
                    new Student(2,"dhanush","java"),
                    new Student(3,"preethi","sql")
            )

    );



    public List<Student> getStudents(){
        return students;
    }

    public Student getStudentByRoll(int roll) {
        int index = 0;
        boolean found = false;
        for(int i = 0; i < students.size();i++){
            if(students.get(i).getRno()==roll){
                index = i;
                found = true;
                break;
            }
        }
        if(found)return students.get(index);
        return new Student(0," "," ");
    }
    public static void addStudent(Student student) {
        students.add(student);
    }

    public String updateStudents(Student student) {
       int index = 0;
       boolean found = false;
       for(int i = 0; i < students.size();i++){
           if(students.get(i).getRno()==student.getRno()){
               index=i;
               found=true;
               break;
           }
       }
       if(!found){
           return "No such student exists";
       }else{
           students.set(index,student);
           return  "updation is done";
       }
    }
    public String deleteStudent(int roll) {
        int index = 0;
        boolean found = false;
        for(int i = 0; i < students.size();i++){
            if(students.get(i).getRno()==roll){
                index = i;
                found = true;
                break;
            }
        }
        if(found){
            students.remove(index);
            return "deleted";
        }else{
            return "no such student exists";
        }
    }
}
