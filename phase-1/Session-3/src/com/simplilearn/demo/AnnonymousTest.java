package com.simplilearn.demo;

public class AnnonymousTest {
	
	///announymous inner class
	
	public static void main(String[] args) {
		
		 Car c= new Car() {

			 @Override
				public void start() {
					// TODO Auto-generated method stub
					
					System.out.println("Car Started");
					
				}

				@Override
				public void stop() {
					// TODO Auto-generated method stub
					System.out.println("Car Stopped");
					
				}
		};

		c.start();
		c.stop();
		
		
	}
	
	
}
