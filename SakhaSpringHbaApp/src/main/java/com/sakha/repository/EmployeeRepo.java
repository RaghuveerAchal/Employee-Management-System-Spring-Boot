package com.sakha.repository;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sakha.model.Employee;

@Repository
public class EmployeeRepo {
	
	@Autowired
	SessionFactory sf;
	
	@Transactional
	public boolean saveEmployee(Employee emp) {
		
	
		Session ssn=sf.openSession();
//		Transaction tx = ssn.beginTransaction();
		ssn.save(emp);
//		tx.commit();
		
		
		
		return true;
	}
	@Transactional
	public Employee getEmployee(int empId) {
		Session ssn=sf.openSession();
		return ssn.get(Employee.class,empId);
		
	}
	@Transactional
	public List<Employee> getemployees(){
		Session ssn = sf.openSession();
		Criteria ctr = ssn.createCriteria(Employee.class);
		return ctr.list();
	}
	@Transactional
	public boolean deleteemployee(Employee emp) {
		Session ssn = sf.openSession();
		ssn.beginTransaction();
		
		
		ssn.delete(emp);
		ssn.getTransaction().commit();
		return true;
	}

}
