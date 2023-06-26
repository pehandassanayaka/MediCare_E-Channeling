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


@WebServlet("/UpdateCustomerServlet")
public class UpdateCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");              //get data from the form and assigning into variables
		String fname = request.getParameter("fname");        //get data from the form and assigning into variables
		String lname = request.getParameter("lname");        //get data from the form and assigning into variables
		String address = request.getParameter("address");    //get data from the form and assigning into variables
		String phone = request.getParameter("phone");        //get data from the form and assigning into variables
		String email = request.getParameter("email");        //get data from the form and assigning into variables
		String password = request.getParameter("password");  //get data from the form and assigning into variables
		
		boolean isTrue;      //declaring variable
		
		isTrue = CustomerDBUtil.updatecustomer(id, fname, lname, address, phone, email, password);   //calling updatecustomer method in CustomerDBUtil and assigning return value to variable
		
		if(isTrue == true)
		{
			List<Customer> cusDetails = CustomerDBUtil.getCustomerDetails(id);   //calling getCustomerDetails method in CustomerDBUtil and assigning return value to customer list object
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");   //navigating from servlet to feedback jsp file
			dis.forward(request,response);       //forwarding to feedback jsp file
			
		}
		else
		{
			List<Customer> cusDetails = CustomerDBUtil.getCustomerDetails(id);   //calling getCustomerDetails method in CustomerDBUtil and assigning return value to customer list object
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");    //navigating from servlet to feedback jsp file
			dis.forward(request,  response);        //forwarding to feedback jsp file
		}
	}

}
