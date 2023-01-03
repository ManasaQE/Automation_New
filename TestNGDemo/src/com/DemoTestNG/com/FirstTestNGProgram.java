package com.DemoTestNG.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNGProgram {
	public String baseURL="https://demo.guru99.com/test/newtours/";
	String driverPath="C:\\Users\\Tejas\\OneDrive\\Desktop\\Manasa\\Downloads\\chromedriver.exe";
	
  @Test
  public void VerifyHomePageTitle() {
	  System.getProperty("webdriver.chrome.driver",driverPath);
	  WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
	  driver.get(baseURL);
	  String expresult="Welcome: Mercury Tours";
	  String actresult=driver.getTitle();
	  Assert.assertEquals(expresult, actresult);
	  driver.close();
	  

  }
}
// login,create user and logout