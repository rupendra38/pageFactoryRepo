package com.fb.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook book;

	public ExcelDataProvider() {
		File file = new File("./TestData/Data.xlsx");
      System.out.println("file name is "+file.getName());
		try {
			FileInputStream fis = new FileInputStream(file);
			book = new XSSFWorkbook(fis);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("file not found");
		}

    
}

	
	
	
	
	
//	public String getString(int sheetIndex, int row, int column)
//
//	{
//		String userNameEx = book.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
//
//		return userNameEx;
//	}

	public String getStringData(String sheetName, int row, int column)

	{
		System.out.println( sheetName+"  "+row+" ..."+column);
		return book.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
		
		
	}

	public double getNumberic(String sheetName, int row, int column) {
		return book.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}
}
