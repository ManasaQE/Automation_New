package com.excelTraining.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tejas\\OneDrive\\Desktop\\Manasa\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\Tejas\\OneDrive\\Desktop\\Manasa\\webTable.html");
		driver.manage().window().maximize();
	//	int sRow = 3;
		int scol = 3;
		for (int i=1; i<=scol; i++) {
			String row2 = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/th["+i+"]")).getText();
			System.out.println(row2);
		}

	}

}
