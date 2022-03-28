package com.simplilearn.abstraction;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle(double radius ,String color) 
	{
		super(color);
		this.radius=radius;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle color= "+getColor() + " and Area = "+area();
	}

	
	 

}
