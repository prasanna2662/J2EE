package com.sathya.servletex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class firstservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/plain");
    	PrintWriter writer=response.getWriter();
    	writer.println("This is first servlet ");
    	writer.println("adv java class by mr.ratan sir");
    	writer.println("servlets applications very good");
    	writer.println("the class is good ");
    	
    }
}
		