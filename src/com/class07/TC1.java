package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class TC1 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome", "https://the-internet.herokuapp.com/");
		
		
	}
	
}