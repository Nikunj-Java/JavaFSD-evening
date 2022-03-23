package com.simplilearn.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {

	public static void main(String[] args) {
		
		String pattern = "[A-Za-z0-9]{6}";

		Pattern p = Pattern.compile(pattern);
		Matcher matcher = p.matcher("Nikunj1");
		
		///required length is 6 and Nikunj1 length is  7 that is why we are getting false
		

		System.out.println("Result is: " + matcher.matches());
		
		
		
		String pattern1= "[789]{1}\\d{9}";
		Pattern p1 = Pattern.compile(pattern1);
		Matcher matcher1 = p1.matcher("7891234567");
		
		if(matcher1.matches()) {
			System.out.println("Mobile number is valid");
			
		}
		else {
			System.out.println("invalid Mobile Number");
		}
		
		
	
	}

}
