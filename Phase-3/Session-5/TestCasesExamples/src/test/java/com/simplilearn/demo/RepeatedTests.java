package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RepeatedTests {

	private Calculator calc=null;
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
		System.out.println("Before Each.. Calculator Initiated");
		calc= new Calculator();
		
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each ..Calculator Stopped");
	}
	
	@Test
	@DisplayName("Add operation test")
	@RepeatedTest(value = 5, name = "Testcase: {displayName} the current Count is"+
	"{currentRepetition} out of {totalRepetitions}")
	
	void addMethod() {
		
		assertEquals(8, calc.add(6, 2),"6 + 2 should equals to 8");	
		System.out.println("========Test Case Passed==========");
	
	}
	
	
	 

}
