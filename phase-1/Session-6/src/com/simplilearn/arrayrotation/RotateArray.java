package com.simplilearn.arrayrotation;

public class RotateArray {
	
	
	public void rotate(int nums[],int k) {
		
		if(k>nums.length)
			k=k%nums.length;///10 divided by 7 will give reminder as 3;
		int result[]= new int[nums.length];// creates new array with size of given array
		
		
		for (int i=0; i<k; i++) {
			result[i]=nums[nums.length-k+i];///7-3=4 this will skip 4 elements(3rd index) and rest elements will be rotated
		}
		
		int j=0;
		
		for (int i=k; i<nums.length; i++) {
			result[i]=nums[j];
			j++;
		}
		System.arraycopy(result, 0, nums, 0, nums.length);;		
		
		
		
	}

}
