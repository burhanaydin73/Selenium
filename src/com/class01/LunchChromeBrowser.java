package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LunchChromeBrowser {
	public static void main(String[] args) throws InterruptedException {
		//                    key                            Value
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\burha"
				+ "\\eclipse-workspace\\SeleniumBatchV\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//http--->hypertext transfer protocol
		 driver.get("http://google.com");
		 Thread.sleep(2000);
		 //browsers navigation commands
		 //it will nagivate to a given url
		 driver.navigate().to("http://www.syntaxtechs.com");
		 //it will nagivate back
		 driver.navigate().back();
		 //it will navigate one step forward
		 driver.navigate().forward();
		
	}
}
