package com.simplilearn.demo;

import java.util.Scanner;

public class SimpleAdd {
	
	public static void main(String[] args) {
		//scan input from user
		
		Scanner sc=new Scanner(System.in);
	
		int num1,num2;
		System.out.println("Enter the first number");
		num1=sc.nextInt();
		System.out.println("Enter the second Number");
		num2=sc.nextInt();
		
		int result =num1+num2;
		
		System.out.println("Result is: "+result);
	}

}
