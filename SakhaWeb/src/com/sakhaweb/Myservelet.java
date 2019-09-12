package com.sakhaweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet({"/register"})
public class Myservelet extends HttpServlet{

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
//		String name=req.getParameter("username");
//		String email=req.getParameter("email");
//		long phone=Long.parseLong(req.getParameter("phone"));
//		String address=req.getParameter("address");
//		String gender=req.getParameter("gender");
//		String country=req.getParameter("country");
//		String []langs=req.getParameterValues("lang");
//		
//		User user=new User(name,email,phone,address,gender,country,langs);
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int sum=num1+num2;
		
	//	addingnumbers an = new addingnumbers(num1,num2);
//		PrintWriter p = res.getWriter();
//		p.print(an);
		
		RequestDispatcher rd=req.getRequestDispatcher("view");
		req.setAttribute("num", sum);
		rd.forward(req, res);
		
	}
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		
		
	}

}
