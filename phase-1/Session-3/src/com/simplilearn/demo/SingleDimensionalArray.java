package com.simplilearn.demo;

import java.util.Scanner;

public class SingleDimensionalArray {
	public static void main(String[] args) {
		
		int array[]= {11,12,13,14,15,16};
		System.out.println("access elements :"+array[3]);
		System.out.println("array length :"+array.length);
		
		
		///print all elements
		
		for (int i=0; i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		///another way of declaration
		
		int a[] =new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<a.length;i++) {
			System.out.println("Enter your Roll No");
			a[i] = sc.nextInt();
		}
		
		
		///print all scanned elements
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
