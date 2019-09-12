package com.sakha.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.sun.tracing.dtrace.ArgsAttributes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@EnableTransactionManagement
public class Employee {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int empid;
	String empName;
	int age;
	
	public Employee(String empName, int age) {
		super();
		this.empName = empName;
		this.age = age;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", age=" + age + "]";
	}
	
	
	
	
}
