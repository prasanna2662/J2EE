package com.sathya.fullnameservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class fullnameservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String FirstName=request.getParameter("FirstName");
		String LastName=request.getParameter("lastName");
		String FullName;
		FullName=FirstName+" " +LastName;
		response.setContentType("text/plain");
		PrintWriter writer=response.getWriter();
		writer.println("your full name "  +FullName);
		
		
	}

}
