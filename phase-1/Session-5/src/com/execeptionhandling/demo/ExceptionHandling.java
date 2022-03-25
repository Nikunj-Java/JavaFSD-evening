package com.execeptionhandling.demo;

public class ExceptionHandling {
	
	
	public static void main(String[] args) {
		
		int sum =0;
		
		for(int i=0; i<args.length; i++) {
			
			try {
				
			///risky code which is going to throws an error
			sum=sum +Integer.parseInt(args[i]);
			
			}
			
			//handle code
			catch (Exception e) {
				// TODO: handle exception
				
				System.out.println("Exception Occured :" +e +"\n Please Enter Valid integer");
			}
			
		}
		
		System.out.println("Sum is = "+sum);
		
	}

}
