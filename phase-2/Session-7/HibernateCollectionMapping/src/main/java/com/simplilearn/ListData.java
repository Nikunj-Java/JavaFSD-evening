package com.simplilearn;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
	
	
	List<EProduct> list= session.createQuery("from EProduct").list();
	
	PrintWriter out= response.getWriter();
	
	out.print("<h1> product List </h1> <hr>");
	
	for (EProduct p: list) {
		out.print(p.getID()+" "+p.getName()+" "+p.getDateAdded()+" "+p.getPrice()+"<br>");
		out.print("Colors <br>");
		
		List<Color> colors= p.getColors();
		
		for(Color c:colors) {
			out.print("Colour id: "+c.getCOLORID()+" Name:"+c.getName()+"<br>");
		}
		
		Collection<ScreenSizes> screen= p.getScreenSizes();
		out.print("Screensizes <br>");
		
		for (ScreenSizes s:screen) {
			out.print("Size: "+s.getSize()+"<br>");
		}
		
		out.print("OS <br>");
		
		Set<OS> os=p.getOs();
		
		for(OS o:os) {
			out.print("OS Id: "+o.getOSID()+" Name: "+o.getName()+"<br>");
			
		}
		
		Map map =p.getFinance();
		
		if(map.get("CREDITCARD")!=null) {
			
			Finance f= (Finance) map.get("CREDITCARD");
			out.print("Name: "+f.getName());
		}
		
		if(map.get("BANK")!=null) {
			Finance f= (Finance) map.get("BANK");
			out.print("Name: "+f.getName());
		}
	}
	
	
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
