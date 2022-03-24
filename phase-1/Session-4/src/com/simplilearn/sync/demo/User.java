package com.simplilearn.sync.demo;

public class User extends Thread {
	
	String name;
	String msg;
	Sender sender;
	
	public User(String name, String msg, Sender sender) {
		
		this.name=name;
		this.msg=msg;
		this.sender=sender;
		
	}
	
	public void run() {
		System.out.println(name+ " : wants to send a message - "+msg);
		//sender.send(msg); //without synchronization
		
		synchronized (sender) {
			sender.send(msg); //without synchronization
		}
	}

}
