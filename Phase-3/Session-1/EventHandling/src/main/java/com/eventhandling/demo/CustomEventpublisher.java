package com.eventhandling.demo;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventpublisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;
	
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		// TODO Auto-generated method stub
		
		this.publisher=publisher;
	}
	
	public void publish() {
		
		CustomEvent ce= new CustomEvent(this);
		publisher.publishEvent(ce);
	}

}
