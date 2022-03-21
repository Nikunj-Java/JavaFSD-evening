package com.simplilearn.demo;

public class Loops {
	
	public static void main(String[] args) {
		
		int i=0;
		
		while(i<5) {
			System.out.println("Using While "+i);
			i++;
		}
		
		do {
			System.out.println("using Do While "+i);
			i++;
		}
		while(i<=10);
		
		for(i=1; i<5 ;i++) {
			
			System.out.println("Using For loop "+i);
		}
		
		System.out.println(i);
		
		
		///nested loop
		for(int row=1;row<=5;row++) {
			
			
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}
