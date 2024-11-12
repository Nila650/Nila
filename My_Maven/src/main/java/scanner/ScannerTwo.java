package scanner;
import java.util.Scanner;
public class ScannerTwo {
public static void main (String args[]) {
	Scanner ob=new Scanner(System.in);
	System.out.println("enter first number :");
	int a=ob.nextInt();
	System.out.println("enter second number :");
	int b=ob.nextInt();
	int c=a+b;
	System.out.println(c);
	
	
}
}

