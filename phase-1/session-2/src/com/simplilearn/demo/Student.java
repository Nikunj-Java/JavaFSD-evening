package com.simplilearn.demo;

public class Student {
	
	//class level variable
	
	int id;
	
	String name;

	///constructor demo
	
	
	//default constructor
	
		public Student() {
			
			id=23;
			name="nikunj";
		}
	
		//parametrized constructor
		 public Student(int id, String name) {
			 
			 this.id=id;
			 this.name=name;
		 }
		
		
	public static void main(String[] args) {
		
		
		//when you create object automatically it calls default constructor
		//if no default constructor found then compiler will  create that
		
		
		//default constructor
		Student obj=new Student();
		System.out.println("user 1");
		System.out.println("Id :" +obj.id);
		System.out.println("Name :" +obj.name);
		
		
		///calling parametrized constructor
		
		Student obj2= new Student(45,"Alexa");
		System.out.println("user 2");
		System.out.println("Id :" +obj2.id);
		System.out.println("Name :" +obj2.name);
		
		
		
		
		
	}
}
