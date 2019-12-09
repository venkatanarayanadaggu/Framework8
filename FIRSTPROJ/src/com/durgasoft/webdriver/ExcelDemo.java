package com.durgasoft.webdriver;

import java.io.FileInputStream
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelDemo {
	
	public static void main(String[] args) throws Exception  {
		
		FileInputStream fi = new FileInputStream("C:\\Users\\User\\Desktop\\selenium\\Newdata.xlsx");
		
	 XSSFWorkbook wb = new XSSFWorkbook(fi);
	 XSSFSheet sheet1= wb.getSheet("Datanames");
	 
	 String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
	 System.out.println("Data from excel is" +data0);
	 wb.close();
	 }

}
