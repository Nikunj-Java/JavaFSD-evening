package com.customexception.demo;

public class UserHandler {

	
	static void check(int age) throws AgeNotValidException
	{
		if(age<18)
			throw new AgeNotValidException("User can not vote before 18 years");
		else
			System.out.println("User Can Vote");
	}
	
	public static void main(String[] args) {
		
		 
			try {
				check(16);
			} catch (AgeNotValidException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		 
	}
}
