package com.simplilearn.demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest1 {
	 
	public String Get_URL(String base_url) {
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		URL url;
		try {
			url= new URL("http://192.168.0.103:4445/wd/hub");
			
			WebDriver driver= new RemoteWebDriver(url,cap);
			
			driver.get(base_url);
			System.out.println("Tittle: "+driver.getTitle());
			
			return driver.getTitle();
			//driver.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
