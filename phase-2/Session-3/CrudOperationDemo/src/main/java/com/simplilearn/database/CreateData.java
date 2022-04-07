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

@WebServlet("/save")
public class CreateData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// create table inside database named student
	// use below code in mysqli client under the database ecommerce
	// create table student (fname varchar(20),lname varchar(20),email
	// varchar(20),password varchar(20));

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		Properties props = new Properties();

		InputStream in = getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);

		Connection conn = DBConfig.getConnection(props);
		
		String fname= request.getParameter("fname");
		String lname= request.getParameter("lname");
		String email= request.getParameter("email");
		String password= request.getParameter("password");
		
		
		if(conn!=null) {
			
			try {
				
				
				PreparedStatement stmt=conn.prepareStatement
						("insert into student (fname,lname,email,password)values(?,?,?,?)");
				stmt.setString(1, fname);
				stmt.setString(2, lname);
				stmt.setString(3, email);
				stmt.setString(4, password);
				
				int rs= stmt.executeUpdate();
				
				if(rs>0) {
					System.out.println(rs+ "row updated successfully");
					response.sendRedirect("fetch");
				}
				else {
					System.out.println("error while inserting data");
					response.sendRedirect("index.html");
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else {
			
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
