package com.servlet;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.customer.Customer;
import com.util.CustomerDBUtil;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("uid");     //get data from the form and assigning into variables
		String password = request.getParameter("pass");    //get data from the form and assigning into variables
		
		try
		{
			List<Customer> cusDetails = CustomerDBUtil.validate(username, password);  //calling validate method in CustomerDBUtil and assigning return value to customer list object
			request.setAttribute("cusDetails", cusDetails);
		}
		catch(Exception e)
		{
			e.printStackTrace();     //display the error
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");    //navigating from servlet to feedback jsp file
		dis.forward(request,  response);          //forwarding to feedback jsp file
		
	}

}
