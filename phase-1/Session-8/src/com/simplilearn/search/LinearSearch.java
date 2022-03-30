package com.simplilearn.search;

import java.util.Scanner;

public class LinearSearch {
	
	
	
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the element to be searched");
		
		int searchValue =sc.nextInt();
		
		int result=linearing(arr,searchValue);
		
		if(result==-1)
			System.out.println("Element not in the array");
		else
			System.out.println("Elemet found at: "+result+ " , and the search key is :  "+arr[result]);
	}

	private static int linearing(int[] arr, int searchValue) {
		// TODO Auto-generated method stub
		
		int n=arr.length;
		
		for(int i=0; i<n;i++) {
			
			if(arr[i]==searchValue) {
				return i;
			}
			
		}
		
		
		return -1;
	}

}
