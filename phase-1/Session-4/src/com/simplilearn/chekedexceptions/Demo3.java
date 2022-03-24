package com.simplilearn.chekedexceptions;

import java.sql.DriverManager;
//cheked execption : database connectivity
public class Demo3 {
	
	public static void main(String[] args) {
		
		DriverManager.getConnection("");
	}

}
