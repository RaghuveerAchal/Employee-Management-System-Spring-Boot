package com.example.demo.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int empId;
	String empIdentity;

	String empName;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	LocalDate dob;
	float basicSalary;

	public Employee() {
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empIdentity=" + empIdentity + ", empName=" + empName + ", dob=" + dob
				+ ", basicSalary=" + basicSalary + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpIdentity() {
		return empIdentity;
	}
	public void setEmpIdentity(String empIdentity) {
		this.empIdentity = empIdentity;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public float getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}
	public Employee(String empName, LocalDate dob, float basicSalary) {
		super();
		this.empName = empName;
		this.dob = dob;
		this.basicSalary = basicSalary;
	}
	
	
	

	

}
