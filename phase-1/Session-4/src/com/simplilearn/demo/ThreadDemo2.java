package com.simplilearn.demo;

public class ThreadDemo2 implements Runnable {

	public void run() {

		System.out.println("Thread Started");

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " " + Thread.currentThread().getName());

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 

		}

	}

	public static void main(String[] args) {

		
		///created 2 target of runnable interface
		ThreadDemo2 ins1 = new ThreadDemo2();
		ThreadDemo2 ins2 = new ThreadDemo2();

		
		/// create 2 threads by passing 2 runnable targets in constructor
		Thread t1 =new Thread(ins1);
		Thread t2 =new Thread(ins2);
		
		t1.setName("First");
		t2.setName("second");
		
		t1.start();
		t2.start();
		
		

	}

}
