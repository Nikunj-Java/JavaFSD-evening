package com.simplilearn.demo;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list =new LinkedList<Integer>();
		
		list.add(12);
		list.add(24);
		list.add(36);
		
		System.out.println("Size : " + list.size());
		
		list.add(67);
		
		System.out.println(list);
		
		//duplicated are allowed
		list.add(67);
		System.out.println(list);
		
		System.out.println("element at index 2: " +list.get(2));
		
		list.removeFirst();
		list.removeLast();
		
		System.out.println(list);
		
	}
	
	
	
	
}
