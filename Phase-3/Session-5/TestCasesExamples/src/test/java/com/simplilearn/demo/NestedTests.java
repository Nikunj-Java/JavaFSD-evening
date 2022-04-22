package com.simplilearn.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class NestedTests {

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
	
	@Test
	void test() {
		 System.out.println("Test Case of Outer Class");
	}
	@Nested
	class Inner{
		
		@BeforeEach
		void setUp() throws Exception {
			System.out.println("Before Each");
		}

		@AfterEach
		void tearDown() throws Exception {
			System.out.println("After Each");
		}
		
		@Test
		void test() {
			System.out.println("TestCase of Inner Class");
		}
		@Nested
		class WhenX{
			
			@BeforeEach
			void setUp() throws Exception {
				System.out.println("Before Each");
			}

			@AfterEach
			void tearDown() throws Exception {
				System.out.println("After Each");
			}
			
			@Test
			void test() {
				System.out.println("TestCase of WhenX Class");
			}
			
		}
		
	}

}
