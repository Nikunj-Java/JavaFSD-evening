package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTestCase {

	Calculator calc;
	
	@BeforeEach
	void setUp() throws Exception {
		calc= new Calculator();
		System.out.println("Calculator Initiated");
	}

	@AfterEach
	void tearDown() throws Exception {
		calc=null;
		System.out.println("Calculator Stopped");
	}
	@Test
	void addTest() {
		assertEquals(5, calc.add(2, 3));
		//assertNotEquals(6, calc.add(2, 3));
		System.out.println("Addition Test");
	}
	@Test
	void subTest() {
		assertEquals(8, calc.sub(16, 8));
		System.out.println("Subtraction Test");
	}
	@Test
	void mulTest() {
		assertEquals(20, calc.multiply(10, 2));
		System.out.println("Multiplication Test");
	}
	@Test
	void divideTest() {
		assertEquals(10, calc.divide(100, 10));
		System.out.println("Division Test");
	}

	 

}
