package com.ems.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

import com.ems.dao.EmployeeDao;
import com.ems.dao.EmployeeDaoImpl;
import com.ems.model.Employee;
import com.ems.util.InvalidDobException;
import com.ems.util.InvalidNameException;
import com.ems.util.InvalidSalaryException;

public class EmployeeServiceImpl implements EmployeeService {

	
	EmployeeDao dao;
	public EmployeeServiceImpl() {
		dao = new EmployeeDaoImpl();
	}
	@Override
	
	public boolean validateEmployee(Employee emp) throws Exception {
		
		String empName = emp.getEmpName();
		LocalDate dob = emp.getDob();
		float salary = emp.getBasicSalary();
		System.out.println("inside validation");
		
		if(empName.length()<4 || empName.length()>15) {
			
			throw new InvalidNameException("Name must be in 4-15 characters");
		}
		if(dob.isAfter(LocalDate.of(1995, 12, 31)) || dob.isBefore(LocalDate.of(1900, 1, 1))) {
			
			throw new InvalidDobException("Dob must be in range 1-1-1900 to 31-12-1995 ");
		}
		if(salary<20000 || salary>80000) {
	
			throw new InvalidSalaryException("Salary should be in range");
		}

		
		return true;
	}
	
public boolean validateEmployee1(Employee emp) throws Exception {
		
		
		float salary = emp.getBasicSalary();
		System.out.println("inside validation");
		
		if(salary<20000 || salary>80000) {
	
			throw new InvalidSalaryException("Salary should be in range");
		}

		
		return true;
	}

	@Override
	public String generateId(String empname) throws Exception {
		String namechar = empname.substring(0,2).toUpperCase();
		Random rand = new Random();
		int dgt = (int)(rand.nextDouble()*10000);
		return namechar+dgt;
	}

	@Override
	public boolean save(Employee emp) throws Exception {
		if(validateEmployee(emp))
		{
			emp.setEmpId(generateId(emp.getEmpName()));
			System.out.println("inside save method of employeeserviceImpl");
			return(dao.save(emp));
			
		}
		else {
		return false;}
	}

	@Override
	public boolean delete(String empid) throws Exception {
		
	
		return dao.delete(empid);
	}

	@Override
	public boolean update(Employee emp) throws Exception {
		if(validateEmployee1(emp)) {
			return dao.update(emp);
		}
		return false;
	}

	@Override
	public Employee getEmployee(String empId) throws Exception {
		
		return dao.getEmployee(empId);
	}

	@Override
	public List<Employee> display() throws Exception {
		return dao.getAllEmployees();
	}

}
