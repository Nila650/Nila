package excelread;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s=ExcelCode.readStringData(2, 0);
		System.out.println(s);
		double c=ExcelCode.readIntegerData(0, 1);
		System.out.println(c);
	}

}
