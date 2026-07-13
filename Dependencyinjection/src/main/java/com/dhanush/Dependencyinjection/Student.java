package com.dhanush.Dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
   // @Autowired                   //field injection
    private Pen pen;

    //construcor injectin  default
    public Student(Pen pen){
        System.out.println("Student Constructor is calling.....");
        this.pen = pen;
    }

    public void show(){
        System.out.println("In Show Method.....");
    }
    public void writeExam(){
        pen.write();
    }

    //setter injection
   // @Autowired
    public void setPen(Pen pen){
        this.pen = pen;
    }


}
