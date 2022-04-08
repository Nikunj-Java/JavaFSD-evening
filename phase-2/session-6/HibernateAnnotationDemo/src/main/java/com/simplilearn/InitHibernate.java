package com.simplilearn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

 
@WebServlet("/init")
public class InitHibernate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		
		//connection pool
		SessionFactory factory= HibernateUtil.getSessionFactory();
		
		// connection
		
		Session session= factory.openSession();
		
		out.println("Hibernate Session Opened");
		session.close();
		out.println("Hibernate Session closed");
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
