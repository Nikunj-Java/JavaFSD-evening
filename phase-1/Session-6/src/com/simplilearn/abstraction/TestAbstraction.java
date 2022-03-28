package com.simplilearn.abstraction;

public class TestAbstraction {
	
	public static void main(String[] args) {
		Shape s= new Rectangle(2.5, 4.5, "Blue");
		Shape s1 =new Circle(1.5, "Red");
		System.out.println(s);
		System.out.println(s1);
		
	}

}
