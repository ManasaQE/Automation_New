package com.excelTraining.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
				
		  System.getProperty("webdriver.chrome.driver","C:\\Users\\Tejas\\OneDrive\\Desktop\\Manasa\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demo.guru99.com/v4/");	
		
		  File file = new File("C:\\Users\\Tejas\\OneDrive\\Desktop\\Manasa\\Excels\\TestProject.xls");
		  FileInputStream inputStream = new FileInputStream(file);
		  HSSFWorkbook wb = new HSSFWorkbook(inputStream);
		  HSSFSheet sheet = wb.getSheet("Login");
		  int lastRow = sheet.getLastRowNum(); 
		  for (int i=0; i<=lastRow; i++) {
			  int cellCount = sheet.getRow(i).getLastCellNum(); 
			  for (int j=0; j<cellCount; j++) { 
				  System.out.print(sheet.getRow(i).getCell(j) + "        ");  
		      } 
			  System.out.println();
		  }
		
		driver.findElement(By.name("uid")).sendKeys("mngr472952");
		driver.findElement(By.name("password")).sendKeys("mUsyjyp");
		driver.findElement(By.name("btnLogin")).click();
		
		String expRes = driver.findElement(By.xpath("//*[contains(text(),'Welcome')]")).getText();
		System.out.println(expRes);
		String actRes = "Welcome To Manager's Page of Guru99 Bank";
		
		if (actRes.equalsIgnoreCase(expRes)) {
			System.out.println("pass");
			HSSFRow row1 = sheet.getRow(1);
			row1.createCell(2).setCellValue("PASS");
		} else {
			HSSFRow row1 = sheet.getRow(1);
			row1.createCell(2).setCellValue("FAIL");
			System.out.println("fail");
		}
		
		FileOutputStream outputStream = new FileOutputStream(file);
		wb.write(outputStream);
		wb.close();
	}

}
