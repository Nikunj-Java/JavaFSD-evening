package com.simplilearn.demo;

public class RegularInnerClass {
	
	 private int a=10;
	
	 class Inner {
		 
		 void display() {
			 System.out.println("Welcome to inner class");
			 System.out.println("value of a is : "+a);
			 
		 }
	 }
	 
	 public static void main(String[] args) {
		
		 RegularInnerClass outer= new RegularInnerClass();
		 RegularInnerClass.Inner inner =outer.new Inner();
		 
		 inner.display();
	}
	 
	 
	  
}
