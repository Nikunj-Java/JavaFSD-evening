package com.simplilearn.database;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/save")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		Properties props = new Properties();

		InputStream in = getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);

		Connection conn = DBConfig.getConnection(props);

		/*
		 * if (conn != null) out.print("Connection is Established"); else
		 * out.print("Error while connecting connection");
		 */
		
		String name= request.getParameter("pname");
		String price= request.getParameter("price");
		
		try {
			CallableStatement stmt= conn.prepareCall("{call add_product(?,?)}");
			
			stmt.setString(1, name);
			stmt.setBigDecimal(2, new BigDecimal(price));
			
			int x=stmt.executeUpdate();
			if(x>0) {
				
				System.out.println("Data inserted Successfully");
				out.print("Data inserted Successfully"); 
				response.sendRedirect("index.html");
			}
			else {
				System.out.println("Error while uploading");
				response.sendRedirect("index.html");
			}
			 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
