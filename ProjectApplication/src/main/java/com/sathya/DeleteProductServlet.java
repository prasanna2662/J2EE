package com.sathya;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/DeleteProductServlet")
public class DeleteProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String proId = request.getParameter("proId");
		
		ProductDao dao = new ProductDao();
		int deleted = dao.deleteById(proId);
		
		//To give the data to JSp put in Request 
		if(deleted==1) {
			request.setAttribute("deleteResult", true);
			//forward the request to JSP file 
			RequestDispatcher dispatcher = request.getRequestDispatcher("productList.jsp");
			dispatcher.forward(request, response);
			
		}
		else
		{
			response.sendRedirect("delerror.jsp");
		}
		
		
		
	}

}
