package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

class ConditionalJRETest {

	 @Test
	 @EnabledOnJre(JRE.JAVA_8)
	 public void runOnJRE8() {
		 
		 System.out.println("This system is running on JRE 8");
	 }
	 
	 @Test
	 @EnabledOnJre(JRE.JAVA_11)
	 public void runOnJRE11() {
		 
		 System.out.println("This system is running on JRE 11");
	 }
	 
	 @Test
	 @EnabledOnJre(JRE.JAVA_17)
	 public void runOnJRE17() {
		 
		 System.out.println("This system is running on JRE 17");
	 }
	 
	 @Test
	 @EnabledIfSystemProperty(named = "os.version",matches = ".*10.*")
	 public void runOnlyOnWIndows10() {
		 System.out.println("Windows 10 Version");
	 }
	 
	 @Test
	 @EnabledIf("myCondition")
	 void condition() {
			System.out.println("Execute test is returns true");
	 }
		
	 @Test
	 @DisabledIf("myCondition")
	 void condition1() {
			System.out.println("Execute test is returns false");
	 }
		
	 boolean myCondition() {
			return true;
	 }

}
