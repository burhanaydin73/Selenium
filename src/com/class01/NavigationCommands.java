package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	 
		
		public static void main(String[]args) {
			
			System.setProperty("Webdriver.chrome.driver", "C:\\Users\\burha"
					+ "\\eclipse-workspace\\SeleniumBatchV\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			 driver.get("http://www.google.com");
			 
			  
		}
		

	}
