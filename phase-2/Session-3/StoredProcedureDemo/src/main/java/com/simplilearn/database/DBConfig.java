package com.simplilearn.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConfig {

	
	public static Connection getConnection(Properties props) {
		
		
		Connection connection=null;
		
		try {
			//get url,username,password
		String driver= props.getProperty("driver");
		String url= props.getProperty("url");
		String username= props.getProperty("username");
		String password= props.getProperty("password");
		
		//to load driver
			Class.forName(driver);
			
			try {
				connection= DriverManager.getConnection(url, username, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}
	
}
