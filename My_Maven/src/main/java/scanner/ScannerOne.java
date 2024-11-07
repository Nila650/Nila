package scanner;
import java.util.Scanner;
public class ScannerOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ob=new Scanner(System.in);
		System.out.println("enter the first number :");
		int a=ob.nextInt();//number-nextInt(),string -nextLine(),float-
		System.out.println("enter the second number :");
		int b=ob.nextInt();
		int c=a+b;
		System.out.println(c);
		
	}

}
