package com.exceptionhandling.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyDemo {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any Value");
		
		try {
			int num =sc.nextInt();
			
			System.out.println("Value is : "+num);
			
			
			
		} catch (InputMismatchException e) {
			// TODO: handle exception
			
			System.out.println("Wrong input : "+e);
		}
		finally {
			
			sc.close();
			System.out.println("Scanner Closed Successfully");
		}
		
		 
		
		
		
	}

}
