package com.simplilearn.unchekedexceptions;



///runtime error: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
public class Demo3 {
	
	public static void main(String[] args) {
		 int array[] = {5,6,7,8,9};
		 
		 System.out.println(array[5]);
	}

}
