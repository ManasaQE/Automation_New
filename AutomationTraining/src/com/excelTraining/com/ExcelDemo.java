package com.excelTraining.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\Tejas\\OneDrive\\Desktop\\Manasa\\Excels\\testData.xls");
		FileInputStream inputStream=new FileInputStream(file);
		HSSFWorkbook wb=new HSSFWorkbook(inputStream);
		HSSFSheet sheet=wb.getSheet("Sheet1");
		HSSFRow row3=sheet.getRow(3);
		HSSFCell cell=row3.getCell(1);
		String city=cell.getStringCellValue();
		System.out.println(city);
		

	}

}
