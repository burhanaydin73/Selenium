package com.WelcomeToTheInternet;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.Constants;
public class Locating extends com.utils.CommonMethods{

	
	public static void main (String[]args) throws InterruptedException {
		
		setUp("chrome", Constants.HRMS_URL);
		//WebElement partialLinkText=driver.findElement(By.partialLinkText("chec"));
		//partialLinkText.click()
		
		 //driver.findElement(By.linkText("Dropdown")).click();
		 //Thread.sleep(2000);
		
		 driver.findElement(By.linkText("Checkboxes")).click();;
		 WebElement chkBox1=driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
		
		 chkBox1.click();
		Thread.sleep(2000);
		if (chkBox1.isSelected()) {
			
			System.out.println("Check box 1 was selected");
			
		}else {
			System.err.println("Check box 1 was not selected-Please re-run");
	
	}
		WebElement chkBox2=driver.findElement(By.xpath("//input[@type='checkbox'][2]"));	
		chkBox2.click();
		
		Thread.sleep(2000);
		chkBox2.click(); 
		if(chkBox2.isSelected()) {
			
			System.out.println("Check box 2 has already selected");
			
		}else {
			System.err.println("Check box 2 was not selected-Please re-run");
	}
}
}
