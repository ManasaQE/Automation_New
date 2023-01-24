package com.excelTraining.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Tejas\\OneDrive\\Desktop\\Manasa\\Excels\\ReadFromExcel.xls");
		FileInputStream inputStream = new FileInputStream(file);
		HSSFWorkbook wb = new HSSFWorkbook(inputStream);
		HSSFSheet sheet = wb.getSheet("Sheet1");
		int lastRow = sheet.getLastRowNum();
		System.out.print(sheet.getRow(0).getCell(0)+ "   ");
		System.out.print(sheet.getRow(0).getCell(1)+ "      ");
		System.out.print(sheet.getRow(0).getCell(2));
		System.out.println();
		for (int i=1; i<=lastRow; i++) {
			HSSFRow row = sheet.getRow(i);
			HSSFCell cell = row.getCell(0);
			double mydouble = cell.getNumericCellValue();
			int myint = (int) mydouble;
			System.out.print(myint+ "    ");
			System.out.print(sheet.getRow(i).getCell(1)+ "       ");
			System.out.print(sheet.getRow(i).getCell(2));
			System.out.println();	
	       }
	}
	
}

