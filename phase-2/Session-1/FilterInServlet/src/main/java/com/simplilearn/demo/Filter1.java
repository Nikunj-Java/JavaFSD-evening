package com.simplilearn.demo;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter1 implements Filter{

	public void destroy() {
		///auto generated method
	}
	
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
	
		String name= request.getParameter("username");
		if(name!=null)
			chain.doFilter(request, response);
		else
			response.getWriter().print("User is invalid");
		
	}
	
	public void init(FilterConfig fConfig) throws ServletException{
		///auto generated method
	}

	 

}
