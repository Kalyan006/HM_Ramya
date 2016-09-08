package com.reports.commonlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {
	
	String ExcelPath ="C:\\Ramya\\Project\\WC\\My_Framework\\TestData\\TestData.xlsx";
	
	public String getExcelData(String sheetName,int rowNum,int colNum) throws InvalidFormatException,IOException
	{
		
		FileInputStream fis = new FileInputStream(ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh  = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		String data = row.getCell(colNum).getStringCellValue();
		return data;
	}
	
	
	public void setExcelData(String sheetName, int rowNum, int colNum, String data) throws InvalidFormatException,IOException
	{
		FileInputStream fis = new FileInputStream(ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		Cell cell =row.getCell(colNum);
		cell.setCellType(Cell.CELL_TYPE_STRING);
		cell.setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(ExcelPath);
		wb.write(fos);
		
	}
	
	public Date getDate(String sheetName,int rowNum,int colNum) throws InvalidFormatException,IOException
	{
		FileInputStream fis = new FileInputStream(ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		Date date = row.getCell(colNum).getDateCellValue();
		return date;
	}

}
