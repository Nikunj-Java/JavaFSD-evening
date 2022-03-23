package com.simplilearn.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {
	
	public static void main(String[] args) {
		String pattern="[a-z]+";
		
		Pattern p= Pattern.compile(pattern);
		String check="Regular Expression";
		
		Matcher matcher=p.matcher(check);
		
		while(matcher.find()) {
			System.out.println(check.substring(matcher.start(),matcher.end()));
		}
	}

}
