package scanner;

import java.util.Scanner;
public class ScannerArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		System.out.println("enter lenght of rectangle :");
		int a=ob.nextInt();
		System.out.println("enter bredth of rectangle :");
		int b=ob.nextInt();
		double c=0.5*a*b;
		System.out.println(c);
		
	}

}
