package com.simplilearn.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/ecommerce";
		String username="root";
		String password="Nikunj@123";
		
		try {
			//load driver
			Class.forName(driver);
			//get connection and store it in con object
			Connection con= DriverManager.getConnection(url, username, password);
			if(con !=null) 
			System.out.println("Connection Established");
			else
				System.out.println("Error while connecting database");
			 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
