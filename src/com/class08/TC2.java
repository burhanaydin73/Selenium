package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;
import com.utils.Constants;

public class TC2 extends CommonMethods {
	public static void main(String[] args) {
		setUp("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dynamic Controls")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[text()='Remove']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[@id='message']")));
		
		String expectedText="It's gone!";
		String actualText=driver.findElement(By.xpath("//p[@id='message']")).getText();
		System.out.println(actualText);
		
		if (actualText.equals(expectedText)) {
			System.out.println("Pass");
		}else {
			System.out.println("Failed");
	}
}
}