package com.simplilearn;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

 

 
@WebServlet("/fetch")
public class FetchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//connection pool
		SessionFactory factory= HibernateUtil.getSessionFactory();
		
		// connection
		
		Session session= factory.openSession();
		
		List<Student> list =session.createQuery("from Student").list();// Student is name of class not a name of table
		
		PrintWriter out= response.getWriter();
		
		for (Student c :list) {
			out.println("Name: "+c.getName()+", Email: "+c.getEmail()+" ,"+" Password: "+c.getPassword());
		}
		
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
