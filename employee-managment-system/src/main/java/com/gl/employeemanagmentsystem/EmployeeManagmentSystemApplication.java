package com.gl.employeemanagmentsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.gl.employeemanagementsystem.entity,"
+"com.gl.com.gl.employeemanagementsystem.service,"
		+"com.gl.employeemanagementsystemsystem.service.impl,"
 +"com.gl.employeemanagementsystemsystem.controller,"
		+"com.gl.employeemanagementsystemsystem.repository"
 )
public class EmployeeManagmentSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagmentSystemApplication.class, args);
	}

}
