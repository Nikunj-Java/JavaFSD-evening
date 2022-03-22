package com.simplilearn.demo;

import java.util.LinkedHashSet;

public class LinkedHashsetDemo {
	
	public static void main(String[] args) {
		
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		
		set.add("aesha");
		set.add("user");
		set.add("pooja");
		set.add("krutika");
		
		
		System.out.println(set);
		
		//not allowed duplicates
		set.add("krutika");
		
		System.out.println(set);
		//check empty
		System.out.println("is empty: "+set.isEmpty());
		
		///remove from set
		
		set.remove("krutika");
		
		System.out.println(set);
		
		///get the size of set
		
		System.out.println("Size: "+ set.size());
		
		set.add(null);
		System.out.println(set);
		
	}

}
