package com.customexception.demo;

public class AgeNotValidException extends Exception{
	
	 
	private String msg;
	
	public AgeNotValidException (String msg) {
		this.msg=msg;
	}

	@Override
	public String toString() {
		return "AgeNotValidException [msg=" + msg + "]";
	}

	 
		

}
