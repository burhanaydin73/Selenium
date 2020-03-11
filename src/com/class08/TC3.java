package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;
import com.utils.Constants;

public class TC3 extends CommonMethods {
	public static void main(String[] args) {
		setUp("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();

		// Click on enable button
		driver.findElement(By.xpath("//*[@id='input-example']/button")).click();
		// add wait webdriver
		WebDriverWait wait = new WebDriverWait(driver, 30);
		// initialize
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("button[onclick='swapInput()']")));
		// enter "Hello" in the box
		 
	}
}