package com.simplilearn.demo;

public class MultiDimensionalArray {
	
	public static void main(String[] args) {
		
		int array[][]= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Let's print Elements");
		
		
		for(int row=0; row<3;row++) {
			
			for(int col=0; col<3; col++) {
														
				System.out.print(array[row][col]+"\t");
				
			}
			
			System.out.println();
			
		}
		
	}
	
	
	
	

}
