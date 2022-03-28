package com.simplilearn.demo;

public class Demo2 {
	
	public static void main(String[] args) {
		
		User user =new User();///prepared object of a class
		user.setId(1);
		user.setName("Alexa");
		user.setAge(20);
		
		System.out.println(user);
		System.out.println("id :"+user.getId()+" ,Name: "+user.getName()+ " ,Age: "+user.getAge());
		
	}
	

}

