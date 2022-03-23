package com.simplilearn.demo;

public class UserImplementedClass {
	
	public static void main(String[] args) {
		/*we can create multiple objects of 
		 car class and we can use the same method
		 which is ALREADY implemenmted in HONDA class
		 */
		
		Honda honda= new Honda();
		honda.start();
		honda.stop();
		
		Suzuki suzuki = new Suzuki();
		suzuki.start();
		suzuki.stop();
	}

}
