package com.simplilearn.demo;

public class StringBufferExample {
	
	public static void main(String[] args) {
		
		StringBuffer str= new StringBuffer("Hello World");
		
		System.out.println("Character at Index 4: "+ str.charAt(4));
		System.out.println("Length of string: "+str.length());
		System.out.println("Replace :"+str.replace(0, 5, "HELLO"));
		System.out.println("Reverse String: "+str.reverse());
		System.out.println("Length of string: "+str.length());
		
		
		
		///CREATE SAME CODE FOR STRING BUILDER
		
		String s="Nikunj Soni";
		StringBuilder str1= new StringBuilder(s);
		
		System.out.println("Character at Index 4: "+ str1.charAt(4));
		System.out.println("Length of string: "+str1.length());
		System.out.println("Replace :"+str1.replace(0, 6, "Kamala"));
		System.out.println("Reverse String: "+str1.reverse());
		System.out.println("Length of string: "+str1.length());
	}

}
