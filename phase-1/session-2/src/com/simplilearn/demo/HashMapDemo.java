package com.simplilearn.demo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		
		
		////hash map
		HashMap<Integer, String> map =new HashMap<Integer, String>();
		
		map.put(1, "Nikunj");
		map.put(2, "alexa");
		map.put(3, "vijay");
		map.put(4, null);
		map.put(5, "test");
		
		System.out.println(map);
		
		System.out.println(map.containsKey(3));
		
		System.out.println("get value of key 2:" +map.get(2));
		
		for (Map.Entry entry: map.entrySet()) {
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
		
		
		
		
		
	}

}
