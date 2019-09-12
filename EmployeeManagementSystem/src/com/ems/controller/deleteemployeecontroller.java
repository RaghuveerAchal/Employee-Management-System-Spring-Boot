package com.ems.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ems.service.EmployeeServiceImpl;

/**
 * Servlet implementation class deleteemployeecontroller
 */
@WebServlet("/deleteemployee")
public class deleteemployeecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteemployeecontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String empid = request.getParameter("empid");
		EmployeeServiceImpl emi = new EmployeeServiceImpl();
		try {
			if(emi.delete(empid)) {
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
