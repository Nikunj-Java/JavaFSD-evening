package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class AssertionTestCase {

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
	void test1() {
		
		String str1=null;
		String str2="Some Value";
		
		assertNull(str1);
		assertNotNull(str2);
		
		assertSame(str1, str1);
		assertNotSame(str1, str2);
		
	}
		
	@Test
	void test2() {
		
		assertThrows(RuntimeException.class, ()->{
			throw new RuntimeException();
		});
		
	}
	
	//@Disabled
	@Test
	void test3() {
		
		String str1=null;
		String str2="Some Value";
		
		String [] a1= {"A","B"};
		String [] a2= {"A","B"};
		
		assertNull(str1);
		assertNotNull(str2);
		
		assertTrue(4>0);
		
		assertFalse(5<1);
		
		assertSame(str1, str1);
		assertNotSame(str1, str2);
		
		assertSame(5, 5);
		assertNotSame(5, 6);
		
		assertArrayEquals(a1, a2);
		
		assertThrows(RuntimeException.class, ()->{
			throw new RuntimeException();
		});
		 
		
	}

}
