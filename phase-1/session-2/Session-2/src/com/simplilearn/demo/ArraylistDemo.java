package com.simplilearn.demo;

import java.util.ArrayList;

public class ArraylistDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList<String>();
		
		list.add("prem");
		list.add("niyati");
		list.add("nikunj");
		list.add("ashwin");
		list.add("chetan");
		
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		
		System.out.println(list.contains("niyati"));
		
		System.out.println("element from index 3: "+list.get(3));
		
		System.out.println("size of list: "+list.size());
		
		//add element to particular position
		list.add(0,"test");
		
		System.out.println(list);
		
		
		System.out.println("size of list: "+list.size());
		
		//print element using for each loop
		
		for(String s:list) {
			System.out.println(s);
		}
		
		
		
		
		
	}

}
