package com.simplilearn.demo;

import java.util.concurrent.locks.Condition;

public class SleepAndWaitMethodDemo {
	
	
	private static Object LOCK =new Object();
	public static void main(String[] args) {
		
		synchronized(LOCK) {
			try {
				
				
				Thread.sleep(1000);///here lock is held by the current thread
				///after 1000 milliseconds , current thread will wake up
				
				/// Thread.wait()// here lock is released by current Thread
				
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 
		 
		
	}

}
