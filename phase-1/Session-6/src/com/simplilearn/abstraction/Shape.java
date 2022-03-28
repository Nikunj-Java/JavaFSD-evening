package com.simplilearn.abstraction;

public abstract class Shape {
	
	private String color;
	abstract double area();
	
	///constructor with same name as that of class
	public Shape(String color) 
	{
		System.out.println("Constructor called");
		this.color=color;
	}

	///getter method
	public String getColor() {
		return color;
	}

	 
	

}
