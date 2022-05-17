package com.sinplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationForm {
	
	public static void main(String[] args) {
		//step:1 Creating System Environment
		System.setProperty("webdriver.chrome.driver","D:\\Phase-5\\chromedriver_win32_latest\\chromedriver.exe");
		
		//step:2 initializing chrome
		WebDriver driver= new ChromeDriver();
		
		//step:3 giving a base url
		driver.get("https://www.shine.com/register/general/");
		
		WebElement name= driver.findElement(By.id("id_name"));
		name.sendKeys("Nikunj Soni");
		
		WebElement email=driver.findElement(By.id("id_email"));
		email.sendKeys("nikunj@gmail.com");
		
		WebElement mobile= driver.findElement(By.id("id_cell_phone"));
		mobile.sendKeys("9876123450");
		
		WebElement password= driver.findElement(By.id("id_password"));
		password.sendKeys("Nikunj@123");
		
		WebElement Check= driver.findElement(By.id("id_privacy"));
		Check.click();
		Check.click();
		
		WebElement login= driver.findElement(By.xpath("//*[@id=\"registerButton\"]"));
		login.click();
		
	}

}
