package com.class05;
/*TC 1: JavaScript alert text verification
*Open chrome browser
*Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
*Click on “Alerts & Modals” links
*Click on “Javascript Alerts” links
*Click on button in “Java Script Alert Box” section
*Verify alert box with text “I am an alert box!” is present
*Click on button in “Java Script Confirm Box” section
*Verify alert box with text “Press a button!” is present
*Click on button in “Java Script Alert Box” section
*Enter text in the alert box
*Quit browser
*/	

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;

	import com.utils.CommonMethods;

	public class TC1 extends CommonMethods{
		
		public static final String SYNTAX_PRACTICE_URL = "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	
	public static void main(String[] args) throws InterruptedException {
		 
				setUp("chrome", SYNTAX_PRACTICE_URL);
				
				Thread.sleep(2000);
				driver.findElement(By.linkText("Alerts & Modals")).click();
				driver.findElement(By.linkText("Javascript Alerts")).click();
//				driver.findElement(By.xpath("//a[@href='#' and text()='Alerts & Modals']")).click();
//				driver.findElement(By.linkText("Javascript Alerts")).click(); 
				driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
				Thread.sleep(2000);
				
				 
				Alert alert=driver.switchTo().alert();
				Thread.sleep(3000);

				System.out.println("Text of Second Alert: "+alert.getText());
				
				 
				alert.dismiss();
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
				alert=driver.switchTo().alert();
				Thread.sleep(2000);
			
				alert.accept();
				Thread.sleep(3000);
				
				
				driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
				alert=driver.switchTo().alert();
				alert.sendKeys("Hello World!");
				Thread.sleep(3000);
				alert.accept();
				String msg=driver.findElement(By.id("prompt-demo")).getText();
				if(msg.contains("Hello World!")){
					
					System.out.println("Test passed");
				}else {
					
					System.out.println("failed");
				}
				driver.close();
	}

}