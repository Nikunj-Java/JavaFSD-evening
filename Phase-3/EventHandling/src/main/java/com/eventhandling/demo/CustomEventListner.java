package com.eventhandling.demo;

import org.springframework.context.ApplicationListener;

public class CustomEventListner implements ApplicationListener<CustomEvent>{

	public void onApplicationEvent(CustomEvent event) {
		// TODO Auto-generated method stub
		
		System.out.println(event.toString());
		
	}
	
	

}
