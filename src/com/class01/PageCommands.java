package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageCommands {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\burha"
				+ "\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.com");
		final String expectedTitle = "Amazon";
		String actualTitle = driver.getTitle();
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("the actual ecpected");
		} else {
			System.err.println("did not match");
		}
		driver.close();
	}
}