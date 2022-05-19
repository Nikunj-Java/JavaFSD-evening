package com.simplilearn.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;

public class GridTestCase {

	GridTest1 gridTest;

	@Test
	public void GoogleTest() {

		gridTest = new GridTest1();
		assertEquals("Google", gridTest.Get_URL("http://www.google.com/"));
		System.out.println("Title Test");

	}

	@Test
	public void facebooktest() {
		 
		assertEquals("Facebook – log in or sign up", gridTest.Get_URL("https://www.facebook.com/"));
		System.out.println("Title Test");

	}
	
	@BeforeMethod
	public void beforeMethod() {
		gridTest = new GridTest1();
	}

	@AfterMethod
	public void afterMethod() {
		gridTest=null;
		 
	}
}
