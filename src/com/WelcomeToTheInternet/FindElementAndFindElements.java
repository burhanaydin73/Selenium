package com.WelcomeToTheInternet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class FindElementAndFindElements extends CommonMethods {

	public static void main(String[] args) {
		 
setUp("chrome", Constants.HRMS_URL);
//driver.findElement(By.linkText("Checkboxes")).click();
//driver.findElements(By.linkText("Checkboxes"));
List<WebElement>allLinks=driver.findElements(By.tagName("a"));

int numberOfAllLinks=allLinks.size();
System.out.println(numberOfAllLinks);

for(WebElement link:allLinks) {
	
	System.out.println(link.getText()+"="+link.getAttribute("href"));
}

driver.quit();

	}

}
