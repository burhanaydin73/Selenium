package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\burha"
						+ "\\eclipse-workspace\\SeleniumBatchV\\drivers\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				//http--->hypertext transfer protocol
				 driver.get("http://www.facebook.com/");

	}

}
