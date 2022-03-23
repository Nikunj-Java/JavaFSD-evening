package com.simplilearn.demo;

public class MethodLocalInnerClass {
	
	
	private void display() {
		
		class Inner{
			
			void myMethod() {
				
				System.out.println("Method From Inner Class");
				
			}
			
		}
		
		Inner inner =new Inner();
		inner.myMethod();
	}
	
	public static void main(String[] args) {
		
		MethodLocalInnerClass mLIC= new MethodLocalInnerClass();
		mLIC.display();
	}

}
