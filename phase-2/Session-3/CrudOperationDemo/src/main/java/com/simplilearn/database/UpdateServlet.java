package com.simplilearn.database;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String email= request.getParameter("email");
		//int id=Integer.parseInt(param);
		 
		
		PrintWriter out = response.getWriter();
		Properties props = new Properties();
		response.setContentType("text/html");
		
		
		InputStream in = getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);

		Connection conn = DBConfig.getConnection(props);
		
		if(conn!=null) {
			
			try {
				 
				PreparedStatement stmt=conn.prepareStatement("select * from student where email=?");
				
						stmt.setString(1, email);
				ResultSet rs= stmt.executeQuery();
				
				out.print("<h1>Welcome user</h1>");
				
				
				if(rs.next()) {
					
					out.print("<form action='update' method='post'>");
					out.print("<input type='hidden' name='email' value='"+rs.getString(3)+"' >");
					out.print("<input type='text' name='fname' value='"+rs.getString(1)+"' >");
					out.print("<input type='text' name='lname' value='"+rs.getString(2)+"' >");
					out.print("<input type='text' name='password' value='"+rs.getString(4)+"' >");
					out.print("<input type='submit'  value='Update Data' >");
					 out.print("</form>");
					System.out.println(rs+ " Row updated in database");
					response.sendRedirect("fetch");
				}
				else {
					System.out.println("No user Available in Database ");
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
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
