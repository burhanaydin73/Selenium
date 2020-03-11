package com.class10;

import org.openqa.selenium.By;

import com.utils.CommonMethods;
import com.utils.Constants;

public class InClassHW extends CommonMethods {
	/*
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {

		setUp("chrome", Constants.HRMS_URL);

		//driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("admin");
		driver.findElement(By.xpath("//span[text()='Username']/preceding-sibling::input")).sendKeys("admin");
		driver.findElement(By.xpath("//span[text()='Password']/preceding-sibling::input")).sendKeys("Hum@nhrm123");
		//driver.findElement(By.xpath("//div[@id='divPassword']/input")).sendKeys("Hum@nhrm123");
		
		driver.findElement(By.xpath("//div[@id='divLoginButton']/input")).click();
		
	}
	
}