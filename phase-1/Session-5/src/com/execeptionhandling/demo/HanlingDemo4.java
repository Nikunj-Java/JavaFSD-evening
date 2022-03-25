package com.execeptionhandling.demo;

public class HanlingDemo4 {
	
	
	static void waitFor() {
		
		try {
			Thread.sleep(2000);
			System.out.println("sleep time is 2sec");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		waitFor();
	}

}
