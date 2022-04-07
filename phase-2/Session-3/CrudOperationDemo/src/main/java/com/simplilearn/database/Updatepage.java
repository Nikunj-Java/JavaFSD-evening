package com.simplilearn.database;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/updatepage")
public class Updatepage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String fname= request.getParameter("fname");
		String lname= request.getParameter("lname");
		String email= request.getParameter("email");
		String password= request.getParameter("password");
		 
		 
		
		PrintWriter out = response.getWriter();
		Properties props = new Properties();
		response.setContentType("text/html");
		
		
		InputStream in = getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);

		Connection conn = DBConfig.getConnection(props);
		
		if(conn!=null) {
			
			try {
				 
				PreparedStatement stmt=conn.prepareStatement("update student set fname=?,lname=?,password=? where email=?");
						stmt.setString(1, fname);
						stmt.setString(2, lname);
						stmt.setString(3, password);
						stmt.setString(4, email);
					 
				int rs= stmt.executeUpdate();
				
				if(rs>0) {
					System.out.println(rs+ " Row updated in database");
					response.sendRedirect("fetch");
				}
				else {
					System.out.println("Error while updating a data");
					response.sendRedirect("fetch");
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else {
			
		}
		
		
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
