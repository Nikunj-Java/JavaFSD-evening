package com.simplilearn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out= resp.getWriter();
		String username= req.getParameter("uname");
		String password =req.getParameter("pass");
		out.print("Welcome "+username);
		out.print("your password is: "+password);
		
		///print full name here: by taking fname and lname
	}
	
	 

}
