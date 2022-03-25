package com.execeptionhandling.demo;

public class HandlingDemo2 {
	
	
	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		try {
			int c=a/b;
			System.out.println("Result is: "+c);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Error is: "+e);
		}
		
		
		
	}

}
