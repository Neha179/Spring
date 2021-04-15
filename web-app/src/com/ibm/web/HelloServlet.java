package com.ibm.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.w3c.dom.css.Counter;


public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private int counter = 1001;
   
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.println("<h1> Hello </h1>");
		
		counter ++;
		out.println("<h2> you are visitor no. :" + counter + "</h2>");
		Date now = new Date();
		out.println("<h3> Date is : " + now + "</h3>");
		
		
		
	}

	

}
