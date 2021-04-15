package com.ibm.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		
		PrintWriter out  =response.getWriter();
		response.setContentType("text/html");
		if(userid.equals("duke") && passwd.equals("java")) {
			out.println("<h1> LOGIN SUCCESS </h2>");
			//response.sendRedirect("hello.jsp"); //if user succeeds
		}
		else {
			response.sendRedirect("login.jsp"); // if user fails
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
