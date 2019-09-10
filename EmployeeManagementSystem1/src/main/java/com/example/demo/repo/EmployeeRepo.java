package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>  {
	
	@Transactional
	@Modifying
	@Query("update Employee set basicSalary=:basicSalary where empId=:empId")
	public void updateEmployee(int empId,float basicSalary);

}
