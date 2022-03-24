package com.simplilearn.unchekedexceptions;

import java.util.Scanner;
/// runtime Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "name" is null
public class Demo4 {

	
	public static void main(String[] args) {
		String name=null;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Email");
		String email =sc.next();
		 
		
	 if(name.equals(email))
		System.out.println("User Aunthenticated");
	 else
		 System.out.println("Not a valid user");
	}
	
	
}
