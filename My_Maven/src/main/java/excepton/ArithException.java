package excepton;

public class ArithException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=0;
System.out.println("starting");
try {
int c=a/b;//code that may raise exception
}
catch(ArithmeticException e)
{
	b=5;
	int d=a/b;// handling code for exception
	System.out.println(d);
	System.out.println(e);
}
finally
{
//System.out.println(c);
System.out.println("ending");
	}
	
	}
}
