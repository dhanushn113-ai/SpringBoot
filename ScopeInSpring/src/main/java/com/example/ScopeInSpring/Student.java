package com.example.ScopeInSpring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component               // component is used to mark a class as spring-managed bean,allowing spring to automatically detects and create object during component scanning
//@Scope("singleton")    // singleton is used to create object only one time though out the entire Spring container
@Scope("prototype")      // prototype is used to create new object every time when bean is requested
public class Student {
    private int age;
    public Student(){
        System.out.println("Inside Constructor");
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
