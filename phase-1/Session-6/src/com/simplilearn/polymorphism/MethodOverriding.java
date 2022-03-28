package com.simplilearn.polymorphism;


class Parent{
	
	public void test() 
	{
		System.out.println("This is Parent class method");
	}
}

class Child extends Parent
{
	public void test() {
		super.test();
		System.out.println("This is Child class method");
	}
}
public class MethodOverriding {
	
	public static void main(String[] args) {
		
		Child c= new Child();
		c.test();
		
	
	}

}

