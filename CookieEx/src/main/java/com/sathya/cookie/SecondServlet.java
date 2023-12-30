package com.sathya.cookie;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the requested data 
		String Qualification = request.getParameter("Qualification");
		String Designation = request.getParameter("Designation");
				
				//create the cookie Object 
				Cookie cookie3 = new Cookie("Qualification",Qualification);
				Cookie cookie4 = new Cookie("Designation",Designation);

				
				//Place the data into session objecy 
				response.addCookie(cookie3);
				response.addCookie(cookie4);

				//forward the request to next form 
				RequestDispatcher dispatcher = request.getRequestDispatcher("Form3.html");
				dispatcher.forward(request, response);
			}
		}

   
