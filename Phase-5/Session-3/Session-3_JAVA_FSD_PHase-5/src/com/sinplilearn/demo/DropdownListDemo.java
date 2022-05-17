package com.sinplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Phase-5\\chromedriver_win32_latest\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		Select dropCountry= new Select(driver.findElement(By.name("country")));
		
		//dropCountry.selectByVisibleText("INDIA");
		//dropCountry.selectByIndex(3);
		 
		
		System.out.println("Selected Value: "+ dropCountry.getFirstSelectedOption().getText());
		
		driver.close();

	}

}
