package com.exceptionhandling.demo;

public class HandlingDemo3 {
	
	static void divide(int a, int b) 
	{
		
		int c =a/b;
		System.out.println("Result is :"+c);
		
	}
	
	
	public static void main(String[] args) {
		try {
			
			divide(2, 0);
		} catch (Exception e) {
			
			// TODO: handle exception
			
			System.out.println("Error is: "+e);
			//e.printStackTrace();
			
		}   
		
	}

}
