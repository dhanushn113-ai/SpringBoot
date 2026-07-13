package com.example.LooseCoupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Autowired
    @Qualifier("pencil")
    private Writer writer;

    public Student() {
        System.out.println("Inside student constructor...");
    }
    public void writeExam() {
        writer.write();
    }
}
