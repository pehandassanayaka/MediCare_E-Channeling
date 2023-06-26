package com.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.CustomerDBUtil;


@WebServlet("/customerRegister")
public class customerRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String fname = request.getParameter("fname");       //get data from the form and assigning into variables
		String lname = request.getParameter("lname");       //get data from the form and assigning into variables
		String address = request.getParameter("address");   //get data from the form and assigning into variables
		String phone = request.getParameter("phone");       //get data from the form and assigning into variables
		String email = request.getParameter("email");		//get data from the form and assigning into variables
		String password = request.getParameter("password"); //get data from the form and assigning into variables
		
		boolean isTrue;
		
		isTrue = CustomerDBUtil.insertcustomer(fname, lname, address, phone, email, password);  //calling insertcustomer method in CustomerDBUtil and assigning return value to variable
		
		if(isTrue == true)
		{
			RequestDispatcher dis = request.getRequestDispatcher("registerSuccess.jsp");   //navigating from servlet to jsp file
			dis.forward(request, response);              //forwarding to jsp file
		}
		else
		{
			RequestDispatcher dis2 = request.getRequestDispatcher("registerFail.jsp");    //navigating from servlet to jsp file
			dis2.forward(request, response);            //forwarding to jsp file
		}
		
	}

}
