package com.simplilearn.sync.demo;

public class TestSynchronization {

	public static void main(String[] args) {
		///common object shared between 2 threads
		
		Sender sender =new Sender();
		
		
		User t1= new User("Supriya", "Hello Good Evening....!", sender);
		
		User t2= new User("Ravi","Hello a Very Good Evening to all of you...!",sender);
		
		t1.start();
		t2.start();
	}
}
