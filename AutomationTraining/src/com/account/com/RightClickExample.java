package com.account.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class RightClickExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tejas\\OneDrive\\Desktop\\Manasa\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");  
		WebElement txtUserID=driver.findElement(By.id("email"));
		Actions builder = new Actions(driver);
		Action seriesofactions=builder
				              .moveToElement(txtUserID)
                              .click()
                              .keyDown(txtUserID, Keys.SHIFT)
                              .sendKeys(txtUserID,"Manasa")
                              .keyUp(txtUserID, Keys.SHIFT)
                              .doubleClick(txtUserID)
                              .contextClick()
                              .build();
		
		seriesofactions.perform();
	}

}
