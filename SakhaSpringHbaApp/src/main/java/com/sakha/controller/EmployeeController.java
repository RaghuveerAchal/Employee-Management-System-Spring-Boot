package com.sakha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sakha.model.Employee;
import com.sakha.service.Employeeservice;

@Controller
public class EmployeeController {
	
	@Autowired
	Employeeservice service;
	
	@PostMapping("/add")
	public String addEmployeee(@ModelAttribute Employee emp,Model m) {
		String msg="Failed...";
		if(service.saveemployee(emp)) {
			msg = "Success";
		}
		m.addAttribute("msg", msg);
		return "view.jsp";
	}
	
	@PostMapping("/employee")
	public String getEmployee(@RequestParam("empId") int empId,Model m) {
		Employee emp=service.getEmployee(empId);
		m.addAttribute("emp", emp);
		return "viewemp.jsp";
		
	}
	@PostMapping("/employees")
	public String getallemployees(Model m) {
		List<Employee> emplist = service.getAllEmployees();
		m.addAttribute("emplist",emplist);
		return "viewall.jsp";
	}
	@PostMapping("/delete")
	public String deletemp(@RequestParam("empId") int empId,Model m ) {
		
		
		String msg="Failed...";
		Employee emp = service.getEmployee(empId);
		if(service.deleteEmployee(emp)) {
			msg="success...";
		}
		m.addAttribute("msg", msg);
		return "view.jsp";
		
	}

}
