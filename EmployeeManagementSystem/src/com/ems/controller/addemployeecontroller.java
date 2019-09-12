package com.ems.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ems.application.EmployeeManagementApp;
import com.ems.model.Employee;
import com.ems.service.EmployeeServiceImpl;

/**
 * Servlet implementation class addemployeecontroller
 */
@WebServlet("/addemployee")
public class addemployeecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addemployeecontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String strdate = request.getParameter("dob");
		Long salary =Long.parseLong( request.getParameter("salary"));
		LocalDate dob;
		StringTokenizer stk = new StringTokenizer(strdate,"-");
		int date = Integer.parseInt(stk.nextToken());
		int month = Integer.parseInt(stk.nextToken());
		int year = Integer.parseInt(stk.nextToken());
		dob = LocalDate.of(year, month, date);
		
		Employee emp= new Employee();
		emp.setEmpName(username);
		emp.setBasicSalary(salary);
		emp.setDob(dob);
		EmployeeServiceImpl es = new EmployeeServiceImpl();
		
		
		try {
			if(es.save(emp)) {
				response.sendRedirect("success.jsp");
			}
			else {
				response.sendRedirect("fail.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
