package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {
	//TC 1: HRMS Application Login: 
	//	Open chrome browser
	//	Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
	//	Enter valid username and password
	//	Click on login button
	//	Then verify Syntax Logo is displayed.
	//userName=sohilaryan
	//password=syntax@12


	public static final String URL="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\burha"
				+ "\\eclipse-workspace\\SeleniumBatchV\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		
		
		WebElement errorMessage=driver.findElement(By.xpath("//span[@id='spanMessage']"));
		//will return either true or false
		System.out.println(errorMessage.isDisplayed());
		WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		userName.sendKeys("sohilaryan");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys();
		
		if(errorMessage.isDisplayed()) {//checking if the error message is displayed or not
			String message=errorMessage.getText();//get the visibale text from error message
			if(message.equals("Password cannot be empty")) {//compare the text with expected message
				System.out.println("Correct Error Message is Displayed");
			}else {
				System.err.println("Incorect error Message is Displayed");
			}	
		
	}

}}