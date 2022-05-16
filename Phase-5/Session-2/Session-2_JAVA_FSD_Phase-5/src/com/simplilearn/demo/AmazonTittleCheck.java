package com.simplilearn.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTittleCheck {
	
	public static void main(String[] args) {
				//step:1 Declare path of driver
				String path="D:\\Phase-5\\chromedriver_win32_latest\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", path);
				
				//step:2 initiate the driver
				WebDriver driver= new ChromeDriver();
				
				//step:3 base url
				String base_url="https://www.amazon.in/";
				
				
			
				String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
				String actualTitle="";
				
				
				//step:4 launch the Amazon
				
				driver.get(base_url);
				
				actualTitle=driver.getTitle();
				
				//compare the title
				
				if(actualTitle.contentEquals(expectedTitle))
					System.out.println("Test Passed");
				else
					System.out.println("Test Failed");
				
				driver.close();
				

	}

}
