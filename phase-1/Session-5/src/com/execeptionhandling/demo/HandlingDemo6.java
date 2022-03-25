package com.execeptionhandling.demo;

public class HandlingDemo6 {
	
	static void check(int age) {
		if(age<18)
			throw new ArithmeticException("Not valid age exception");
		else
			System.out.println("Valid user");
		
	}
	
	public static void main(String[] args) {
		
		try {
			check(6);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error Occured Due to : "+e.getMessage());
		}
		
		
	}

}
