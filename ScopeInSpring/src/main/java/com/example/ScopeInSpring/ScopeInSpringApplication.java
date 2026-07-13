package com.example.ScopeInSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ScopeInSpringApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ScopeInSpringApplication.class, args);
		Student student = context.getBean(Student.class);
		student.setAge(12);
		Student student1 = context.getBean(Student.class);
		System.out.println("Student age: " + student.getAge() + "   Student1 age: " + student1.getAge());
	}

}
