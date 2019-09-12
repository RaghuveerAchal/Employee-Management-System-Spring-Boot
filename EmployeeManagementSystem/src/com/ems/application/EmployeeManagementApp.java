package com.ems.application;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Date;
import java.util.StringTokenizer;
import java.io.*;

import com.ems.model.Employee;
import com.ems.service.EmployeeService;
import com.ems.service.EmployeeServiceImpl;

public class EmployeeManagementApp {
	
	EmployeeService es;
	BufferedReader in;
	
	public EmployeeManagementApp() {
		es = new EmployeeServiceImpl();
		in = new BufferedReader(new InputStreamReader(System.in));
		
	}
	
	public boolean addEmployee(String empName,String strdate,Long sal)throws Exception {

		LocalDate dob;
		StringTokenizer stk = new StringTokenizer(strdate,"-");
		int date = Integer.parseInt(stk.nextToken());
		int month = Integer.parseInt(stk.nextToken());
		int year = Integer.parseInt(stk.nextToken());
		dob = LocalDate.of(year, month, date);
		System.out.println(sal);
		
		Employee emp= new Employee();
		emp.setEmpName(empName);
		emp.setBasicSalary(sal);
		emp.setDob(dob);
		return es.save(emp);
		
		
	}
	
	public void deleteEmployee() {
		
	}
	
	public void showEmployee() {
		
		
	}
	public void displayAll() {
		
		
	}
	public static void main(String[] args) {
		
	}
	
	

}
