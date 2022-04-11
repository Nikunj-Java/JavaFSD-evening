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
 
@WebServlet("/list")
public class ListData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		 SessionFactory factory= HibernateUtil.getSessionFactory();
		 Session session= factory.openSession();
		 
		 List<EProduct>list =session.createQuery("from EProduct").list();
		 
		 
		 PrintWriter out= response.getWriter();
		 
		 out.print("<h1>Product List</h1><hr>");
		 
		 for (EProduct p:list) {
			 
			 out.print(p.getID() + " "+p.getName()+" "+p.getPrice());
			 out.print("Product Parts: <br>");
			 
			 ProductParts parts= p.getParts();
			 
			 out.print("HDD: " +parts.getHdd()+"<br>");
			 out.print("CPU: " +parts.getCpu()+"<br>");
			 out.print("RAM: " +parts.getRam()+"<br>");
		 }
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
