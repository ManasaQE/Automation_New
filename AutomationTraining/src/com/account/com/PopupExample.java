package com.account.com;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver","C:\\Users\\Tejas\\OneDrive\\Desktop\\Manasa\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/popup.php");
		driver.findElement(By.linkText("Click Here")).click();
		String maintab=driver.getWindowHandle();
		// to handle all new opened windows
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		while (i1.hasNext()) {
			String childtab=i1.next();
			if (!maintab.equalsIgnoreCase(childtab)) {
				// switch to child window
				driver.switchTo().window(childtab);
				driver.findElement(By.name("emailid")).sendKeys("manasa.mca@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				//driver.close();
				//driver.quit();
			}
		}
			
		driver.switchTo().window(maintab);
		//driver.close();
		driver.quit();
		

	}

}
