package com.simplilearn.unchekedexceptions;

import java.util.Scanner;


///run time :Exception in thread "main" java.lang.ArithmeticException:
public class Demo1 {
	
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 2 number");
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();
		
		int divide = num1/num2;
		
		System.out.println("Division is: "+divide);
		System.out.println("End of Program");
	}

}
