package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {
	
	public static void main(String[] args) {
		
		//step:1 Declare path of driver
				System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\chromedriver_win32_latest\\chromedriver.exe");
				//step:2 initiate the driver
				WebDriver driver= new ChromeDriver();
				//step:3 launch the facebook
				driver.get("https://www.shine.com/registration/");
				
				WebElement Check= driver.findElement(By.id("id_privacy"));
				
				//check- checkbox is selected or not??
				
				if(Check.isSelected()) {
					System.out.println("check box is selected by default");
					System.out.println("status of checkbox: "+Check.isSelected());
				}
				else {
					System.out.println("CheckBox is Not Selected");
				}
				
				Check.click();
				System.out.println("status of checkbox: "+Check.isSelected());
				
				 
		
	}

}
