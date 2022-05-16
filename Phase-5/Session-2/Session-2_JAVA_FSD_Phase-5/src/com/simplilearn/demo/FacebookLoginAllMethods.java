package com.simplilearn.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginAllMethods {

	public static void main(String[] args) {
		//step:1 Declare path of driver
		System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\chromedriver_win32_latest\\chromedriver.exe");
		//step:2 initiate the driver
		WebDriver driver= new ChromeDriver();
		//step:3 launch the facebook
		driver.get("https://www.facebook.com/");
		
		//1. find by id
		WebElement email1= driver.findElement(By.id("email"));
		
		//2. find by name
		WebElement email2= driver.findElement(By.name("email"));
		
		//compare
		System.out.println("Id and Name Found :" +email1.equals(email2));
		//3. linktext-already done
		
		//4. by using relativepath-xpath
		WebElement email3=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		
		//compare
		System.out.println("Id and Xpath Found :" +email1.equals(email3));
		
		
		//5.by using fullxpath
		WebElement email4=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
		//compare
		System.out.println("Xpath and FullXpath Found :" +email3.equals(email4));
				
		
		//6. by using css selector
		WebElement email5= driver.findElement(By.cssSelector("#email"));
		//compare
		System.out.println("FullXpath and CSS Selector Found :" +email4.equals(email5));
						
		
		//7. list of webelement
		
		List<WebElement> list= driver.findElements(By.cssSelector("input.inputtext"));
		for(WebElement e:list) {
			System.out.println("List of WebElements are: "+e.getAttribute("placeholder"));
		}
		
		//8. Tag and Attribute
		WebElement pass= driver.findElement(By.cssSelector("input[name=pass]"));
		System.out.println("Password using Tag: "+pass.getAttribute("placeholder"));
		
		driver.close();
	}

}
