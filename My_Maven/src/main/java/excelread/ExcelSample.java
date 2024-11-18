package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSample {

	public static FileInputStream f;
	public static XSSFWorkbook w;    //fetch workbook
	public static XSSFSheet s;   //fetch sheet

	public static 	String readStringData(int i,int j) throws IOException
	{
		f=new FileInputStream("C:\\Users\\USER\\OneDrive\\Desktop\\ExcelSample.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		XSSFRow r=s.getRow(i);
		XSSFCell c=r.getCell(j);
		return c.getStringCellValue();
		
		
	}
	public static double readIntegerData(int i,int j) throws IOException
	{
		f=new FileInputStream("C:\\\\Users\\\\USER\\\\OneDrive\\\\Desktop\\\\ExcelSample.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		XSSFRow r=s.getRow(i);
		XSSFCell c=r.getCell(j);
		return c.getNumericCellValue(); 
	}
	}


