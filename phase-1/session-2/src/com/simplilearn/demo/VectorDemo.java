package com.simplilearn.demo;

import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		
		Vector<String> vector= new Vector<String>();
		vector.add("apple");
		vector.add("kiwi");
		vector.add("banana");
		
		System.out.println(vector);
		
		System.out.println("Size :"+vector.size());
		
		System.out.println("at position 2: "+vector.get(2));
		
	}

}
