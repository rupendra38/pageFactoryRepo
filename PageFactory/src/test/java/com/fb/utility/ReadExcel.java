package com.fb.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {

	
	@Test
	public void read() throws FileNotFoundException
	{
		
		File file=new File("./TestData/Data.xlsx");
		FileInputStream fis=new FileInputStream(file);
		try {
			XSSFWorkbook book=new XSSFWorkbook(fis);
			XSSFSheet sheet=   book.getSheet("login");

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	     
	}
}
