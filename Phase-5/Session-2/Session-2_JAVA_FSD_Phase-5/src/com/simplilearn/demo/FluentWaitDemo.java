package com.simplilearn.demo;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitDemo {
	
	public static void main(String[] args) {
		
		        //step:1 Declare path of driver
				System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\chromedriver_win32_latest\\chromedriver.exe");
				//step:2 initiate the driver
				WebDriver driver= new ChromeDriver();
				//step:3 launch the fluent wait demo page
				driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
				
				driver.findElement(By.xpath("//*[@id=\"post-body-5280210221385817166\"]/div[1]/button")).click();
				
				//fluent wait
				
				FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
						.withTimeout(30, TimeUnit.SECONDS)
						.pollingEvery(5, TimeUnit.SECONDS)
						.ignoring(NoSuchElementException.class);
				
				WebElement element= wait.until(new Function<WebDriver, WebElement>() {

					@Override
					public WebElement apply(WebDriver driver) {
						// TODO Auto-generated method stub
						
						WebElement element= driver.findElement(By.xpath("//*[@id=\"demo\"]"));
						
						String getTextOnPage= element.getText();
						
						if(getTextOnPage.equals("Software Testing Material - DEMO PAGE")) {
							System.out.println(getTextOnPage);
							return element;
						}
						else {
							System.out.println("Fluent Wait Failed! Waiting For Element to Load");
							return null;
						}
						 
					}
					
				});
	}

}
