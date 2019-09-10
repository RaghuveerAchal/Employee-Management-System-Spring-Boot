package com.example.demo.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.StringTokenizer;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@Controller
//@RestController
//@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@PostMapping("addemployee")
	public String addEmployee(@ModelAttribute Employee emp,Model m)throws Exception {

		

		Employee saveEmp = service.addEmployee(emp);
		m.addAttribute("emp",saveEmp);
		return "success";
		
	}
	@PostMapping("deleteemployee")
	public String deleteEmployee(@RequestParam("empId") int empId,Model m) {
		service.deleteEmployee(empId);
		return "success";
		
		
	}
	@PostMapping("updateemployee")
	public String updateEmployee(@RequestParam("empId") int empId,@RequestParam("basicSalary") float basicSalary,Model m) {
		
		service.updateEmployee(empId,basicSalary);
		return "success";
		
	}
	@GetMapping("getemployee")
	public String getEmployee(@RequestParam("empId") int empId,Model m) {
		Employee emp=service.getEmployee(empId);
		m.addAttribute("emp",emp);
		return "showing";
	}
	
	@GetMapping("getallemployee")
	public String getallEmployee(Model m) {
		List<Employee> elist=service.getEmployees();
		m.addAttribute("elist",elist);
		return "allemployeeshowing";
	}
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() throws Exception{
		return service.getEmployees();
	}
	@GetMapping("/employees/{empId}")
	public Employee getemployee(@PathVariable("empId") int empId)throws Exception{
		return service.getEmployee(empId);
	}
	@DeleteMapping("employees/{empId}")
	public boolean deleteemployee(@PathVariable("empId") int empId){
		return service.deleteEmp(empId);
	}
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee emp) throws Exception {
		return service.addEmployee(emp);
		
	}
	@PutMapping("/employees")
	public Employee updateemp(@RequestBody Employee emp) {
		return service.updateEmp(emp);
	}
	
	
	
}
