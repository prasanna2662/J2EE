package com.sathya.product;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductInvoiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the data
		int proId=Integer.parseInt(request.getParameter("proId"));
		String proName=request.getParameter("proName");
		double proPrice=Double.parseDouble(request.getParameter("proPrice"));
		int proQuantity=Integer.parseInt(request.getParameter("proQuantity"));
		//process the data
		double totalBill;
		totalBill=proPrice*proQuantity;
		double discount=0;
		String discountMessage="No Discount";
		
		if(totalBill>1000 && totalBill<5000)
		{
			discount=totalBill*0.05;
			discountMessage="5% discount";
		}
		else if(totalBill>5000 && totalBill<10000)
		{
				discount=totalBill*0.1;
				discountMessage="10% discount";
			}
		else if(totalBill>10000)
		{
				discount=totalBill*0.15;
				discountMessage="15% discount";
			}
		else 
		{
				
				discountMessage="no discount";
			}
		   double netbill;
		   netbill=totalBill-discount;
		
		// Render the response
		   response.setContentType("text/html");
		   PrintWriter writer = response.getWriter();
		   
		   writer.println("<html><body bgcolor = 'aqua'>");
		   writer.println("<h1>  *Product Invoice***</h1>");
		   writer.println("<p> Your Product Id....."+proId+ "</p>");
		   writer.println("<p> Your Product Name....."+proName+ "</p>");
		   writer.println("<p> Your Product Price....."+proPrice+ "</p>");
		   
		   writer.println("<p> Total Price of " +proQuantity + " Products:  $" +totalBill + "</p>");
		   writer.println(discountMessage+ " Amount....."+discount);
		   writer.println("<p> Net Amount to Pay: $ "+netbill  + "</p>");
		   writer.println("</body></html>");
		 }

		}

	
	

    





