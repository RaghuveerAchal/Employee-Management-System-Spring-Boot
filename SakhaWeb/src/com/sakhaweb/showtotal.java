package com.sakhaweb;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class showtotal
 */
@WebServlet({ "/showtotal", "/viewinfo" })
public class showtotal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showtotal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		int total = (int)getServletContext().getAttribute("totalapp");
		
//		response.getWriter().println("Total  "+total);
	
		
//		Date d2 = new Date();
//		SimpleDateFormat df1 = new SimpleDateFormat("HH:mm:ss");
		
		Long formattedDate = (Long)getServletContext().getAttribute("time");
		
		Date d1 = new Date();
//		SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
		Long formattedDate1 = d1.getTime();
//		Date firstdate = df.parse(formattedDate);
//		Date Seconddate = df.parse(formattedDate1);
		
		
		long diff = formattedDate1 - formattedDate;
		long sec = diff/1000;
		
		response.getWriter().println("Total time  "+sec+"sec");
	
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
