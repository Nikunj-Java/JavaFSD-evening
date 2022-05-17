package com.sinplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//step:1 Creating System Environment
				System.setProperty("webdriver.chrome.driver","D:\\Phase-5\\chromedriver_win32_latest\\chromedriver.exe");
				
				//step:2 initializing chrome
				WebDriver driver= new ChromeDriver();
				
				//step:3 giving a base url
				driver.get("https://nxtgenaiacademy.com/alertandpopup/");
				
				
				driver.findElement(By.name("alertbox")).click();
				driver.switchTo().alert().accept();
				
				System.out.println("You have Clicked AlertBox");
				
				driver.findElement(By.name("confirmalertbox")).click();
				driver.switchTo().alert().accept();
				
				System.out.println("Clicked Confirm AlertBox: "+driver.findElement(By.id("demo")).getText());
				
				 driver.findElement(By.name("promptalertbox1234")).click();
				 driver.switchTo().alert().sendKeys("No");
				 driver.switchTo().alert().accept();
				 
				 
				 System.out.println("Clicked Prompt AlertBox With Value: "+driver.findElement(By.id("demoone")).getText());
				 
				 driver.close();
				 
				
				

	}

}
