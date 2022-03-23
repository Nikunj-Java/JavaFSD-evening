package com.simplilearn.demo;

public class LocalInnerClass {
	
	
	void validate(int age) {
		
		if(age>=18) {
			class Inner {
				
				void test() {
					
					System.out.println("Now Authenticating User For Aadhar");
					
				}
			}
			
			Inner inner = new Inner();
			inner.test();
		}
		else {
			System.out.println("No Need Aadhar Authentication");
		}
		
		
	}
	
	public static void main(String[] args) {
		LocalInnerClass local= new LocalInnerClass();
		local.validate(21);
			
	}

}
