package com.simplilearn.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	public static void main(String[] args) {
		String pattern = "[A-Za-z0-9]*";

		Pattern p = Pattern.compile(pattern);
		Matcher matcher = p.matcher("Prabhaat@123");

		System.out.println("Result is: " + matcher.matches());
	}

}
