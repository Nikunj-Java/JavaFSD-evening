package com.simplilearn.polymorphism;
///compile time polymorphism
public class MethodOverLoading {
	
	public int sum(int x, int y)
	{
		return x+y;
	}
	
	public int sum(int x, int y, int z)
	{
		return x+y+z;
	}
	
	public static void main(String[] args) {
		MethodOverLoading m= new MethodOverLoading();
		System.out.println(m.sum(1, 3));
		System.out.println(m.sum(4, 7, 9));
	}

}
