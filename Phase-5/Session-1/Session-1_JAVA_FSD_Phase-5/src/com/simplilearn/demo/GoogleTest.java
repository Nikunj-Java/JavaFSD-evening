package com.simplilearn.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
	
	public static void main(String[] args) {
		
		//Step:1 give a path
		String path="D:\\Phase-5\\chromedriver_win32_latest\\chromedriver.exe";
		
		//Setp:2 Giving System property
		System.setProperty("webdriver.chrome.driver", path);
		
		//Step:3 initiate google chrome driver
		WebDriver driver = new ChromeDriver();
		
		//step:4 giving a url
		driver.get("https://www.google.com/");
		
		
		
		
		
	}

}
