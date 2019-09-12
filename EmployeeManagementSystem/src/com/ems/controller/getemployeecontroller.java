package com.ems.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ems.model.Employee;
import com.ems.service.EmployeeServiceImpl;

/**
 * Servlet implementation class getemployeecontroller
 */
@WebServlet("/getemployee")
public class getemployeecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getemployeecontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empid = request.getParameter("empid");
		EmployeeServiceImpl emi = new EmployeeServiceImpl();
		Employee emp;
		try {
			emp = emi.getEmployee(empid);
			System.out.println(emp.getEmpId());
			
			HttpSession ssn = request.getSession();
			ssn.setAttribute("id",emp.getEmpId() );
			ssn.setAttribute("name",emp.getEmpName() );
			ssn.setAttribute("dob",emp.getDob() );
			ssn.setAttribute("salary",emp.getBasicSalary());
			response.sendRedirect("showing.jsp");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
