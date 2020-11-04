package com.acti.utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excellibrary {
//create a constructor use of it is it will initialize the object.
	XSSFWorkbook wb;
public Excellibrary()
{
	try
  {
	File file = new File("./src/test/resources/testdata/MavTestData.xlsx");
	FileInputStream fis = new FileInputStream(file);
	 wb = new XSSFWorkbook(fis);
   }
catch(Exception e)
   {
	System.out.println("unable to read data from excel file"+ e.getMessage());
	}
}
	
public int getRowCount(int Sheetnum)
   {
	return wb.getSheetAt(Sheetnum).getLastRowNum()+1;
	}
public String getCellData(int Sheetnum, int row,int cell)
{
	return wb.getSheetAt(Sheetnum).getRow(row).getCell(cell).toString();
	
}
}








