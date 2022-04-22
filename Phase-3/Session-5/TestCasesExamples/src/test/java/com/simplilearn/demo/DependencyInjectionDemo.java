package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@DisplayName("Dependency Injection Example")
public class DependencyInjectionDemo {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
	}
	
	public DependencyInjectionDemo(TestInfo testInfo) {
		
		System.out.println("Test Name is: "+testInfo.getDisplayName());
		Assertions.assertEquals("Dependency Injection Example", testInfo.getDisplayName());
	}
	@Test
	@DisplayName("Another Test")
	public void myTest(TestInfo testInfo) {
		
		System.out.println("Test Name is: "+testInfo.getDisplayName());
		Assertions.assertEquals("Another Test", testInfo.getDisplayName());
	}
	
	
	@Test
	@DisplayName("Test 1")
	@Tag("my-tag")
	public void myTest1(TestInfo testInfo) {
		System.out.println("Test Name is: "+testInfo.getDisplayName());
		System.out.println("Tag Name is: "+testInfo.getTags());
		
		Assertions.assertEquals("Test 1", testInfo.getDisplayName());
		Assertions.assertTrue(testInfo.getTags().contains("my-tag"));
		
	}

	 
	

}
