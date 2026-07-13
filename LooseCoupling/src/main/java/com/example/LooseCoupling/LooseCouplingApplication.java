package com.example.LooseCoupling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LooseCouplingApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(LooseCouplingApplication.class, args);
		Student student = context.getBean(Student.class);
		student.writeExam();
	}

}
