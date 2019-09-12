package com.sakha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakha.model.Employee;
import com.sakha.repository.EmployeeRepo;

@Service
public class Employeeservice {
	
	@Autowired
	EmployeeRepo empr; 
	public boolean saveemployee(Employee emp) {
		return empr.saveEmployee(emp);
		
	}
	public Employee getEmployee(int empId) {
		return empr.getEmployee(empId);
	}
	public boolean deleteEmployee(Employee emp) {
		return empr.deleteemployee(emp);
	}
	public List<Employee> getAllEmployees(){
		return empr.getemployees();
	}

}
