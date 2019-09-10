package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class EmployeeManagementSystem1Application {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystem1Application.class, args);
	}

}
