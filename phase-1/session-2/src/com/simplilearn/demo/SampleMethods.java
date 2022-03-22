package com.simplilearn.demo;

public class SampleMethods {
	
	///method with  no  return value, without parameter
	public void display() {
		System.out.println("Welcome to JAVA");
	}
	
	///method which will calculate some value and return as a result
	//passing 2 parameters
	
	public int add(int a, int b) {
		 
		int num1 =a+b;//5+10=15
		int num2 =a*b;//5*10=50
			
		return num1+num2;//50+15=65
	}
	
	
	///method to check user validity and return true or false, one parameter
	
	public boolean valid(int age) {
		
		if(age>18)
			return true;
		else 
			return false;
	}
	
	
	//method to return fullname bbased on fname and lname , 2 parametrized
	
	public String fullname( String fname, String lname) {
		
		return fname+" "+lname;
	}
	
	//write a method to convert temperature from celcius to fereiheit
	
	public float toFeranheit(float celcius) {
		
		return ((celcius*9)/5)+32;
	}
	public static void main(String[] args) {
		
		///calling a method
		SampleMethods s=new SampleMethods();
		s.display();
		
		System.out.println("Total is: "+s.add(5, 10));
		
		
		System.out.println("Valid for vote : "+s.valid(17));
		
		System.out.println("Full Name is : "+s.fullname("Nikunj", "Soni"));
		
		System.out.println("Temperatur in celcius: 20 C");
		System.out.println("Temperatur in Faranheit: "+s.toFeranheit(20) +" F");
		
	}

}
