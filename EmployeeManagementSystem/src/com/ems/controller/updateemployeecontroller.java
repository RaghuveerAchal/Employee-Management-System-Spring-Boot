package com.ems.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ems.model.Employee;
import com.ems.service.EmployeeServiceImpl;

/**
 * Servlet implementation class updateemployeecontroller
 */
@WebServlet("/updateemployee")
public class updateemployeecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateemployeecontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empid = request.getParameter("empid");
		Long salary = Long.parseLong(request.getParameter("salary"));
		Employee emp = new Employee();
		emp.setEmpId(empid);
		emp.setBasicSalary(salary);
		EmployeeServiceImpl emi = new EmployeeServiceImpl();
		try {
			if(emi.update(emp)) {
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
