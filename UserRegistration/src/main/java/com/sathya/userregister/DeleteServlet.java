package com.sathya.userregister;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String UserId = request.getParameter("userId");
		
		UserDao dao = new UserDao();
		int result = dao.deleteById(UserId);
		
		//To give the data to JSp put in Request 
		request.setAttribute("result", result);
		
		//forward the request to JSP file 
		RequestDispatcher dispatcher = request.getRequestDispatcher("userdelete.jsp");
		dispatcher.forward(request, response);
	}

	}


