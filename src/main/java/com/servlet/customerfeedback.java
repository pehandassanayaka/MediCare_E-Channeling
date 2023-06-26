package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.CustomerDBUtil;

@WebServlet("/customerfeedback")
public class customerfeedback extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("name");    //get data from the form and assigning into variables
		String email = request.getParameter("email");  //get data from the form and assigning into variables
		String message = request.getParameter("message");    //get data from the form and assigning into variables
		
		boolean isTrue;   //declaring variable
		
		isTrue = CustomerDBUtil.insertFeeback(name, email, message);   //calling insertFeeback method in CustomerDBUtil and assigning return value to variable
		
		if(isTrue == true)
		{
			RequestDispatcher dis = request.getRequestDispatcher("feedbackSuccess.jsp");  //navigating from servlet to jsp file
			dis.forward(request,  response);       //forwarding to jsp file
		}
		else
		{
			RequestDispatcher dis2 = request.getRequestDispatcher("registerFail.jsp");   //navigating from servlet to jsp file
			dis2.forward(request,  response);      //forwarding to jsp file
		}
		
	}

}
