package com.simplilearn.demo;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String s= new String ("Hello World");
		System.out.println("Length: "+s.length());
		System.out.println("Character at 3: "+s.charAt(3));
		System.out.println(s.startsWith("Hello"));
		
		
		
		String str ="     Hello      ";
		System.out.println(str.length());
		System.out.println(str.stripLeading().length());
		System.out.println(str.stripTrailing().length());
		System.out.println(str.trim().length());
	}

}
