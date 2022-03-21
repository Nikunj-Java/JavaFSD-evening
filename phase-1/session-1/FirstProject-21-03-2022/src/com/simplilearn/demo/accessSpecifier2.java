package com.simplilearn.demo;

public class accessSpecifier2 {
	public static void main(String[] args) {
		System.out.println("Private Access Specifier");
		
		priAccessSpecifier obj= new priAccessSpecifier();
		///trying to access private method of another class
		//obj.display();
	}

}
