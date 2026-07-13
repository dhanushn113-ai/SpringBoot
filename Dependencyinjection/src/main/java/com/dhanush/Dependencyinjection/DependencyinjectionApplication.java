package com.dhanush.Dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyinjectionApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DependencyinjectionApplication.class, args);
		Student std = context.getBean(Student.class);
		std.show();
		std.writeExam();
	}

}
