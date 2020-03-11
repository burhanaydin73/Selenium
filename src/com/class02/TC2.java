package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC2 {

	
			//TC 2: Mercury Tours Registration: 
			//1.Open chrome browser2.Go to“http://newtours.demoaut.com/”
			//3.Click on Register Link
			//4.Fill out all required info
			//5.Click Submit
			//6.User successfully registered
	public static final String URL="C:\\Users\\burha\\eclipse-workspace\\SeleniumBatchV\\drivers\\chromedriver.exe";
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver",URL);
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		Thread.sleep(2000);
		WebElement userName=driver.findElement(By.linkText("REGISTER"));
		userName.click();
		WebElement userName1=driver.findElement(By.xpath("//input[@name='firstName']"));
		userName1.sendKeys("Burhan");
		Thread.sleep(2000);
		
		
		WebElement userName2=driver.findElement(By.cssSelector("input[name='lastName']"));
		userName2.sendKeys("Aydin");
		WebElement userName3=driver.findElement(By.cssSelector("input[name='phone']"));
		userName3.sendKeys("123456789");
		userName1.clear();
		Thread.sleep(2000);
		userName1.sendKeys("Hilal");
		//driver.close();
	 
	}

}
