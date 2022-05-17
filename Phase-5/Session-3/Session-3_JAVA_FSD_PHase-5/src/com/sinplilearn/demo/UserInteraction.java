package com.sinplilearn.demo;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.google.common.collect.ImmutableBiMap.Builder;

public class UserInteraction {

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
		
		WebElement username= driver.findElement(By.id("email"));
		WebElement pass= driver.findElement(By.id("pass"));
		WebElement login= driver.findElement(By.name("login"));
		
		
		
		Actions builder = new Actions(driver);
		
		Action seriesofAction = builder
				.moveToElement(username)
				.click()
				.sendKeys(username,"Hello")
				.keyDown(username,Keys.SHIFT)
				.doubleClick()
				.contextClick()
				.build();
		seriesofAction.perform();

	}

}
