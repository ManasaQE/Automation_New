package com.account.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tejas\\OneDrive\\Desktop\\Manasa\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");  
        WebElement link_home=driver.findElement(By.linkText("Home"));
        WebElement tb_home=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[1]"));
        Actions builder=new Actions(driver);
        Action mouseoverhome=builder
                        	.moveToElement(link_home)
                            .build();
        String bgcolor=tb_home.getCssValue("background-color");
        System.out.println("Before mouseover= "+bgcolor);
        
        mouseoverhome.perform();
        bgcolor=tb_home.getCssValue("background-color");
        System.out.println("After mouseover= "+bgcolor);
        driver.close();
	}

}
