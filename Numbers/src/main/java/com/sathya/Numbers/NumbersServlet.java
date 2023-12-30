package com.sathya.Numbers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NumbersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  int firstnumber=Integer.parseInt(request.getParameter("firstnumber"));
		  int lastnumber=Integer.parseInt(request.getParameter("lastnumber"));
		  String Logical=request.getParameter("numbers");
		  ArrayList<Integer>result=new ArrayList<Integer>();
		  switch(Logical )
		  {
		  case "even":for(int i=firstnumber;i<=lastnumber;i++)
		  {
		   if(i%2==0)
		   {
		    result.add(i);
		   }
		  }
		  break;
		  case "odd":for(int i=firstnumber;i<=lastnumber;i++)
		  {
		   if(i%2==1)
		   {
		    result.add(i);
		   }
		  }
		  break;
		  case "prime" :for(int i=firstnumber;i<=lastnumber;i++)
		  {
		   int fact=0;
		   for(int j=2;j<=i;j++)
		   {
		    if(i%j==0)
		    {
		     fact++;
		     break;
		    }
		    if(fact==0)
		    {
		     result.add(1);
		    }
		   }
		  }
		  break;
		  case "perfect" :for(int i=firstnumber;i<=lastnumber;i++)
		  {
		   int sum=0;
		   for(int j=1;j<=i/2;j++)
		   {
		    if(i%j==0)
		    {
		     sum+=j;
		    }
		   }
		   if(sum==1)
		   {
		    result.add(i);
		   }
		    }
		  break;
		  case"strong" :for(int i=firstnumber;i<=lastnumber;i++)
		  {
		   int temp=i,sum=0;
		   while(temp!=0)
		   {
		    int digit=temp%10;
		    int fact=1;
		    for(int j=1;j<=digit;j++)
		    {
		     fact*=j;
		    }
		    sum+=fact;
		    temp/=10;
		   }
		   if(sum==i)
		   {
		    result.add(i);
		   }
		  }
		  break;
		  case "armstrong" :for(int i=firstnumber;i<=lastnumber;i++)
		  {
		   int temp=i,temp2=i;
		   int sum=0,count=0;
		   while(temp!=0)
		   {
		    temp/=10;
		    count++;
		   }
		   while(temp2!=0)
		   {
		    int digit=temp2%10;
		    sum+=(int)Math.pow(digit, count);
		    temp2/=10;
		   }
		   if(sum==i)
		   {
		    result.add(i);
		   }
		   
		  }
		  break;
		   }
		  response.setContentType("text/html");
		  PrintWriter writer=response.getWriter();
		  RequestDispatcher dispatcher=request.getRequestDispatcher("Numbers.html");
		  dispatcher.include(request, response);
		  writer.println("result is..."+result);
		 }
		}


