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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
				
		  System.getProperty("webdriver.chrome.driver","C:\\Users\\Tejas\\OneDrive\\Desktop\\Manasa\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  
		  File file = new File("C:\\Users\\Tejas\\OneDrive\\Desktop\\Manasa\\Excels\\TestProject.xls");
		  FileInputStream inputStream = new FileInputStream(file);
		  HSSFWorkbook wb = new HSSFWorkbook(inputStream);
		  HSSFSheet sheet = wb.getSheet("Login");
		  int lastRow = sheet.getLastRowNum()-sheet.getFirstRowNum();
		  
		  driver.manage().window().maximize();
		  driver.get("https://demo.guru99.com/v4/");	
		  
		  WebElement userName=driver.findElement(By.name("uid"));
	      WebElement password=driver.findElement(By.name("password"));
	      WebElement submit=driver.findElement(By.name("btnLogin"));
		
		  
		  for (int i=1; i<=lastRow; i++) {
			  userName.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
			  password.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
			  submit.click();
		
		WebElement confirmationMessage = driver.findElement(By.xpath("//*[contains(text(),'Welcome')]"));
		//String expRes = driver.findElement(By.xpath("//*[contains(text(),'Welcome')]")).getText();
		
		
		HSSFCell cell = sheet.getRow(i).createCell(2);
        
       
        if (confirmationMessage.isDisplayed()) {
           
            cell.setCellValue("PASS");
            
        } else {
            
            cell.setCellValue("FAIL");
        }
		
		FileOutputStream outputStream = new FileOutputStream(file);
		wb.write(outputStream);
		wb.close();
	}

}
}
