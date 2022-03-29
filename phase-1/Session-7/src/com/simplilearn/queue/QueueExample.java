package com.simplilearn.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	
	
	public static void main(String[] args) {
		
		Queue<String> locationsQueue =new LinkedList<>();
		
		locationsQueue.add("Mumbai");
		locationsQueue.add("Delhi");
		locationsQueue.add("patna");
		locationsQueue.add("kolkata");
		locationsQueue.add("Gurgaon");
		locationsQueue.add("Noida");
		
		System.out.println("Queue is : "+locationsQueue);
		
		System.out.println("Head of a Queue : "+ locationsQueue.peek());
		
		locationsQueue.remove();
		
		System.out.println("After removing head of Queue : "+locationsQueue);
		
		System.out.println("Size of Queue : "+ locationsQueue.size());
		
	}

}
