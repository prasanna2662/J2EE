package com.sathya.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Username=request.getParameter("username");
		String Password=request.getParameter("password");
		if(Username.equalsIgnoreCase("Prasanna")  &&  Password.equals("Prasanna123"))
		{
			RequestDispatcher Dispatcher=request.getRequestDispatcher("success.html");
			Dispatcher.forward(request, response);
		}
		else
		{
			response.setContentType("text/html");
			PrintWriter writer=response.getWriter();
			RequestDispatcher dispatcher=request.getRequestDispatcher("login.html");
			dispatcher.include(request, response);
			writer.println("login fail..try with valid data");
			
		}
	}

}
