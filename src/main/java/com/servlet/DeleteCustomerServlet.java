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


@WebServlet("/DeleteCustomerServlet")
public class DeleteCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		boolean result;     //declaring variable
		
		result = CustomerDBUtil.deleteCustomer(id);     //calling deleteCustomer method in CustomerDBUtil and assigning return value to variable
		
		if(result == true)
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("register.jsp");    //navigating from servlet to jsp file
			dispatcher.forward(request, response);      //forwarding to jsp file
		}
		else
		{
			List<Customer> cusDetails = CustomerDBUtil.getCustomerDetails(id); //calling getCustomerDetails method in CustomerDBUtil and assigning return value to customer list object
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("useraccount.jsp");  //navigating from servlet to jsp file
			dispatcher.forward(request, response);       //forwarding to jsp file
		}
	}

}
