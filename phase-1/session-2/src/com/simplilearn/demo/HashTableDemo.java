package com.simplilearn.demo;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
	
	public static void main(String[] args) {
		Hashtable<Integer, String>map =new Hashtable<Integer, String>();
		
		map.put(1,"nikunj");
		map.put(2, "ankit");
		map.put(3, "rishabh");
		//map.put(4, null);
		
		System.out.println(map);
		
		System.out.println(map.containsKey(3));
		
		System.out.println("get value of key 2: "+map.get(2));
		
		for (Map.Entry entry: map.entrySet()) {
			
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

		
		 

		
	}

}
