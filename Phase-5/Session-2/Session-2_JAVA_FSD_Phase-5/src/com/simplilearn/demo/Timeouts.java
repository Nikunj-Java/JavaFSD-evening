package com.simplilearn.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Timeouts {
	public static void main(String[] args) {
		        //step:1 Declare path of driver
				System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\chromedriver_win32_latest\\chromedriver.exe");
				//step:2 initiate the driver
				WebDriver driver= new ChromeDriver();
				//step:3 launch the facebook
				driver.get("https://www.facebook.com/");
				
				//implicit wait timeout for 20second
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				//script timeouts
				driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
				
				//pageload timeout
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				
				WebElement email= driver.findElement(By.id("email"));
				email.sendKeys("nikunj@gmail.com");
				
				
				
				
	}

}
