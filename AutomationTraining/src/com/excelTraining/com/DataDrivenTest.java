package com.excelTraining.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTest {
	static HSSFCell uid;
	static HSSFCell pwd;
	static HSSFCell status;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver","C:\\Users\\Tejas\\OneDrive\\Desktop\\Manasa\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		File file=new File("C:\\Users\\Tejas\\OneDrive\\Desktop\\Manasa\\Excels\\TestProject.xls");
		FileInputStream inputStream=new FileInputStream(file);
		HSSFWorkbook wb=new HSSFWorkbook(inputStream);
		HSSFSheet sheet=wb.getSheet("Login");
		
		driver.get("http://www.facebook.com");	
		driver.manage().window().maximize();
	    
		for (int i=1; i<=sheet.getLastRowNum(); i++ ) {
			uid = sheet.getRow(i).getCell(0);
			pwd = sheet.getRow(i).getCell(1);
			status = sheet.getRow(i).createCell(2);
			//cell.setCellType(Cell.CELL_TYPE_STRING);
			driver.findElement(By.id("email")).sendKeys(uid.getStringCellValue());
			driver.findElement(By.id("pass")).sendKeys(pwd.getStringCellValue());
			Thread.sleep(10);
			if (i<=2) {
				driver.findElement(By.id("email")).clear();
				driver.findElement(By.id("pass")).clear();
			}		
			// Identify the login element
		//	driver.findElement(By.name("login")).click();	
			// Verify home page /error message (if condition)
			 
		/*
		 * String expRes1 =
		 * driver.findElement(By.xpath("//div[@class='_9kpn']")).getText();
		 * System.out.println(expRes1); String actRes1 = "Is this your account?"; //
		 * result = update excel if (actRes1.equalsIgnoreCase(expRes1)) {
		 * status.setCellValue("FAIL"); System.out.println("status is fail"); } else {
		 * status.setCellValue("PASS"); System.out.println("status is pass"); }
		 */
		/*
		 * FileOutputStream outputStream=new FileOutputStream(file);
		 * wb.write(outputStream);
		 */
		}
		// close the browser		
		wb.close();
		//driver.close();	

	}

}
