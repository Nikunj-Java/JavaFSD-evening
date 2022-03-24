package com.simplilearn.sync.demo;

public class Sender {
	
	void send(String msg) {
		
		System.out.println("Sending Mesaagge : " +msg);
		
		try {
			
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("Error while Sending Message:");
		}
		System.out.println("Message Sent Successfully");
	}

}
