package com.simplilearn.unchekedexceptions;

import java.util.Scanner;


///runtime : Exception in thread "main" java.lang.NumberFormatException: For input string: "a"
public class Demo2 {

	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any number");
		String num1 =sc.next();
		
		///convert String to  int
		
		
		int number = Integer.parseInt(num1);
		
		System.out.println("Number is : "+number);
		System.out.println("End of Program");
	}
}

