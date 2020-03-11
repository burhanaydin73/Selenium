package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {
	
	//TC2 updated
	
	//TC 2: Syntax Page URL Verification: 
//	Open chrome browser
//	Navigate to “https://www.syntaxtechs.com/”
//	Navigate to “https://www.google.com/”
//	Navigate back to Syntax Technologies Page
//	Refresh current page
//	Verify url contains “Syntax”
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\compa\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		 driver.get("https://www.syntaxtechs.com/");
		 Thread.sleep(2000);
		 driver.navigate().to("http://google.com");
	     driver.navigate().back();
	     driver.navigate().refresh();
	String currentUrl=driver.getCurrentUrl();
	if(currentUrl.contains("syntax")) {
		System.out.println("Cointains sytax");
	}else {
		System.out.println("not cointain syntax");
	}
	driver.close();
	}
// Test case2 last one

}

