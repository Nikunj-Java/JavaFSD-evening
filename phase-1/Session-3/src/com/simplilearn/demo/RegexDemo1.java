package com.simplilearn.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {
	
	public static void main(String[] args) {
		
		
		String pattern ="[A-Za-z]aat";
		
		Pattern p=Pattern.compile(pattern);
		Matcher matcher= p.matcher("Baat");
		
		System.out.println("Result is: "+matcher.matches());
		
		
		
	}

}
