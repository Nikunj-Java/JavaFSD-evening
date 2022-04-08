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
import org.hibernate.Transaction;
 
@WebServlet("/save")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
PrintWriter out= response.getWriter();
		
		//connection pool
		SessionFactory factory= HibernateUtil.getSessionFactory();
		
		// connection
		
		Session session= factory.openSession();
		
		Transaction tx=session.beginTransaction();
		Student stud1= new Student();
		stud1.setName("Amit");
		stud1.setEmail("Amit@gmail.com");
		stud1.setPassword("Amit@123");
		
		session.save(stud1);
		
		tx.commit();
		session.close();
		
		response.getWriter().print("Data Inserted Successfully");
		
		
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
