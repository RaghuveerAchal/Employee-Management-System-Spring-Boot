package com.sakhaweb;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		HttpSession ssn = request.getSession();
		ServletContext context = getServletContext();
		
//		if(context.getAttribute("totalapp")==null) {
//			context.setAttribute("totalapp", 1);
//		}
//		else {
//			int n = (int)context.getAttribute("totalapp");
//			n++;
//			context.setAttribute("totalapp", n);
//		}
//		response.getWriter().println("<a href='viewinfo'>show total</a>");

		Date d1 = new Date();

		Long firsttime = d1.getTime();
		context.setAttribute("time", firsttime);
//		SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
//		 formattedDate = df.format(d1);
//		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
//		Date d2 = format.parse(d1);
		
		response.getWriter().println("<a href = 'viewinfo'>show time</a>");
	
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
