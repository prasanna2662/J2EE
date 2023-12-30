package com.sathya.loginapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//get the request
		  String Username=request.getParameter("username");
		  String Password=request.getParameter("password");
		  //process the request
		  if(Username.equalsIgnoreCase("Prasanna")&&Password.equals("Prasanna123"))
		  {
			  
			  response.sendRedirect("https://www.sathyatech.com");
		  }
		  else
		  {
			  
			   response.sendError(909,"the given credits are not matched");
			   
		  }
	
	}

}
