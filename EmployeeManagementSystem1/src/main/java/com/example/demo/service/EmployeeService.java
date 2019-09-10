package com.example.demo.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo repo;
	
	public Employee addEmployee(Employee emp) throws Exception {
		
		emp.setEmpIdentity(generateId(emp.getEmpName())); 
		
		
		return repo.save(emp);
	}
	public Employee getEmployee(int empId) {
		return repo.getOne(empId);
	}
	
	public List<Employee> getEmployees(){
		return repo.findAll();
	}
	
	public void deleteEmployee(int empId) {
		repo.deleteById(empId);
	}
	public void updateEmployee(int empId,float salary) {
		repo.updateEmployee(empId,salary);
	}
	
	public String generateId(String empname) throws Exception {
		String namechar = empname.substring(0,2).toUpperCase();
		Random rand = new Random();
		int dgt = (int)(rand.nextDouble()*10000);
		return namechar+dgt;
	}
	public boolean deleteEmp(int empId) {
		repo.deleteById(empId);
		return true;
	}
	public Employee updateEmp(Employee emp) {
		Employee emp1 = getEmployee(emp.getEmpId());
		emp1.setEmpName(emp.getEmpName());
		emp1.setDob(emp.getDob());
		emp1.setBasicSalary(emp.getBasicSalary());
		emp1.setEmpIdentity(emp.getEmpIdentity());
		return repo.save(emp1);
	}

	
}
