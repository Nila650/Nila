package excelread;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;

public class ExcelSampleMain extends ExcelSample {
	
	public static void readAllData() {
	
	for(int i=0;i< s.getLastRowNum();i++)
	{
		XSSFRow row=s.getRow(i);
		if(row!=null)
		{
			for(int j=0;j<row.getLastCellNum();j++)
			{
				XSSFCell cell=row.getCell(j);
			}
		}
	}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.out.println(ExcelSample.readStringData(0,0));
System.out.println(ExcelSample.readIntegerData(0, 1));

	
	}

}
