package com.ems.application;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.StringTokenizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.*;

import com.ems.model.Employee;
import com.ems.service.EmployeeService;
import com.ems.service.EmployeeServiceImpl;
import com.ems.config.AppConfig;

public class EmployeeManagementApp {
	

	@Autowired
	@Qualifier("es")
	EmployeeService es ;
	public EmployeeService getEs() {
		return es;
	}

	public void setEs(EmployeeService es) {
		this.es = es;
	}
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public EmployeeManagementApp() {
		
	}
	
	public void addEmployee()throws Exception {
		String empName;
		LocalDate dob;
		float sal;

		System.out.println("Enter employee details(name,dob(dd-mm-yyyy),salary)");
		empName = in.readLine();
		System.out.println("employee name="+empName);
		String strDate = in.readLine();
		System.out.println("strDate="+strDate);
		StringTokenizer stk = new StringTokenizer(strDate,"-");
		int date = Integer.parseInt(stk.nextToken());
		int month = Integer.parseInt(stk.nextToken());
		int year = Integer.parseInt(stk.nextToken());
		dob = LocalDate.of(year, month, date);
		sal = Float.parseFloat(in.readLine());
		System.out.println(sal);
		
		Employee emp= new Employee();
		emp.setEmpName(empName);
		emp.setBasicSalary(sal);
		emp.setDob(dob);
		System.out.println("after creatin employee object");
		es.save(emp);
		
		
	}
	
	public void deleteEmployee()throws Exception {
		System.out.println("Enter the empid");
		String empstr = in.readLine();
		boolean flag=es.delete(empstr);
		System.out.println(flag);
		
		
	}
	
	public void showEmployee() {
		
		
	}
	public void displayAll() {
		
		
	}
	public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);

		EmployeeManagementApp app = context.getBean("app",EmployeeManagementApp.class);
		try {
			app.deleteEmployee();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	

}
