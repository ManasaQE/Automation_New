package com.account.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.getProperty("webdriver.chrome.driver",
		  "C:\\Users\\Tejas\\OneDrive\\Desktop\\Manasa\\Downloads\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		  driver.get("http://demo.guru99.com/test/delete_customer.php");
		  driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234");
		  driver.findElement(By.xpath("//input[@name='submit']")).click();
		  String vmessage=driver.switchTo().alert().getText();
		  System.out.println(vmessage);
		  driver.switchTo().alert().accept();
		  
		 
		
// Types of Alerts
		/*
		 * 1. Simple Alert- Some information or warning on the screen. 2. Prompt Alert-
		 * It asks for input from the user. 3. Confirmation Alert-
		 */
		     
		/*
		 * driver.switchTo().alert().dismiss(); // to click on the cancel button of the
		 * alert- void dismiss driver.switchTo().alert().accept(); // to click on the ok
		 * button driver.switchTo().alert().getText(); // to capture alert message
		 * driver.switchTo().alert().sendKeys(null); //
		 */
		
		
		
	}

}
