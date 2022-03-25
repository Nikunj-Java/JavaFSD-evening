package com.execeptionhandling.demo;

import java.util.concurrent.Executors;

public class HandlingDemo5 {
	
	///throwing checked Exception
	static void  check(int age) throws Exception {
		
		if(age<18) 
			throw new Exception("Not Valid age Exeption");
		else  
			 System.out.println("Valid user");
		 
	}
	
	static void test() throws Exception{
		
		check(14);
	}

	public static void main(String[] args) {
		
		try {
			
			test();
			
		} catch (Exception e) {
			// TODO: handle exception
			//e.printStackTrace();
			
			System.out.println("Error Occured: "+ e.getMessage());
		}
		   
		
	}
}
