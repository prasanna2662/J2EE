package com.sathya.cali;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  //get the request
		  int firstnumber=Integer.parseInt(request.getParameter("firstnumber"));
		  int secondnumber=Integer.parseInt(request.getParameter("secondnumber"));
		  String op=request.getParameter("arithmetic");
		  //process the data
		  int res=0;
		  switch(op)
		  {
		  case "add": res=firstnumber+secondnumber;
		              break;
		  case "sub":res=firstnumber-secondnumber;
		              break;
		  case "mul":res=firstnumber*secondnumber;
		              break;
		  case "div":res=firstnumber/secondnumber;
		              break;
		  case "mod":res=firstnumber%secondnumber;
		              break;
		  }
		  //render the process
		  response.setContentType("text/html");
		  PrintWriter writer=response.getWriter();
		  RequestDispatcher dispatcher=request.getRequestDispatcher("caliciFile.html");
		  dispatcher.include(request, response);
		  writer.println("result="+res);
		 
		
        

}
}
