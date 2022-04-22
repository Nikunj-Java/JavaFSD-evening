package com.simplilearn.demo;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

class ConditionalOSTest {

	 
	 @Test
	 @EnabledOnOs({OS.WINDOWS})
	 public void runOnWindows() {
		 System.out.println("This runs on windows");
	 }
	 
	 @Test
	 @EnabledOnOs({OS.MAC})
	 public void runOnMac() {
		 System.out.println("This runs on mac");
	 }
	 
	 @Test
	 @EnabledOnOs({OS.LINUX})
	 public void runOnLinux() {
		 System.out.println("This runs on linux");
	 }
}
