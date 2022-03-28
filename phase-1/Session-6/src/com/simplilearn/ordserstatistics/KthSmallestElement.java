package com.simplilearn.ordserstatistics;

import java.util.Arrays;

public class KthSmallestElement {
	
	public static int kthSmallest(Integer[] arr,int k) {
		
		Arrays.sort(arr);
		///we will return k'th element in the sorted array
		return arr[k-1];
	}
	
	
	public static void main(String[] args) {
		Integer arr[]= new Integer[] {28,16,46,38,55,89,83,30};
		
		int k=4;
		System.out.println("Kth smallest Element is :" +kthSmallest(arr, k));
	}

}
