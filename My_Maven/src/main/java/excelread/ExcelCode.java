package excelread;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
public static FileInputStream f; //fetch file
public static XSSFWorkbook w;    //fetch workbook
public static XSSFSheet s;   //fetch sheet

//to read String data

public static String readStringData(int i,int j) throws //void string
IOException
{
	
	f=new FileInputStream("C:\\Users\\USER\\OneDrive\\Desktop\\excelread.xlsx");//double slash
	w=new XSSFWorkbook(f);
	s=w.getSheet("Sheet1");//method to fetch particular sheet
	XSSFRow r=s.getRow(i);//to fetch row,XSSFROW=class
	XSSFCell c=r.getCell(j);//to fetch cell according to index ,XSSFCell=class
	return c.getStringCellValue();//to fetch string value
	
	
}


public static double readIntegerData(int i,int j) throws IOException
{
	f=new FileInputStream("C:\\Users\\USER\\OneDrive\\Desktop\\excelread.xlsx");
	w=new XSSFWorkbook(f);
	s=w.getSheet("Sheet1");
	XSSFRow r=s.getRow(i);
	XSSFCell c=r.getCell(j);
	return c.getNumericCellValue(); //to fetch numeric value
}
}
