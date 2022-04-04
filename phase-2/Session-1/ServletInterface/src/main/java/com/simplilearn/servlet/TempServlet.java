package com.simplilearn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TempServlet implements Servlet {

private ServletConfig config=null;
	
	@Override
	public void destroy() {
		config=null;
		System.out.println("Destroyed Called");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		
		return config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return config.getServletName();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init Called");
		this.config=config;
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
	
		System.out.println("Service is  called");
		PrintWriter out = resp.getWriter();
		out.print("This is my servlet");
		
	}
	
	
	

}
