package com.simplilearn.coockie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		Cookie c[]=request.getCookies();
		
		boolean found=false;
		
		if(c!=null)
		{
			for(int i =0; i<c.length;i++ ) {
				
				Cookie ck= c[i];
				if(ck.getName().contentEquals("registered") && ck.getValue()!=null)
				{
					out.println("User Found " + ck.getValue()+ "<br>");
					found= true;
				}
			}
		}
	
		
		
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
