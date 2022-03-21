package com.simplilearn.demo;

import java.util.Scanner;

public class ConditionTest {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age");
		
		int age =sc.nextInt();
		if(age>=18) {
			System.out.println("valid for voting");
		}
		else {
			System.out.println("Not Valid for Voting");
		}
		
	}

}
