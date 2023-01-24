package com.excelTraining.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class UpdateExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\Tejas\\OneDrive\\Desktop\\Manasa\\Excels\\testData.xls");
		FileInputStream inputStream=new FileInputStream(file);
		HSSFWorkbook wb=new HSSFWorkbook(inputStream);
		HSSFSheet sheet=wb.getSheet("Sheet1");
		HSSFRow row4=sheet.createRow(4);
		row4.createCell(0).setCellValue("greeshma");
		row4.createCell(1).setCellValue("pupala");
		row4.createCell(2).setCellValue("Delhi");
		FileOutputStream outputStream = new FileOutputStream(file);
		wb.write(outputStream);
		wb.close();
	}

}
