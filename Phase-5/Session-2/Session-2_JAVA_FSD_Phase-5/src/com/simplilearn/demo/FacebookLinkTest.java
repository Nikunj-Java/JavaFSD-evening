package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//step:1 Declare path of driver
		
		
		String path="D:\\Phase-5\\chromedriver_win32_latest\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		
		//step:2 initiate the driver
		WebDriver driver= new ChromeDriver();
		
		//step:3 base url
		String base_url="https://www.facebook.com/";
		
		//step:4 launch the facebook
		driver.get(base_url);
		
		WebElement linktext= driver.findElement(By.linkText("Forgotten password?"));
		linktext.click();

	}

}
