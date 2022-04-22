package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

class DynamicTestExample {

	
	@TestFactory
	Collection<DynamicTest> MyDynamicTestExample()
	{
		
		return Arrays.asList(
				dynamicTest("Test 1", () -> {assertTrue(true);}),
				dynamicTest("Test 2", () -> {assertEquals(5,2+3);}),
				dynamicTest("Test 3", () -> {assertFalse(9<1);}),
				dynamicTest("Test 4", () -> {assertThrows(RuntimeException.class,
						() ->{throw new RuntimeException();});}),
				dynamicTest("Test 5", new MyExecutable())
				);
				
	}
	
	class MyExecutable implements Executable {

		@Override
		public void execute() throws Throwable {
			// TODO Auto-generated method stub
			
			System.out.println("My Executable class");
			
		}
		
	}

}
