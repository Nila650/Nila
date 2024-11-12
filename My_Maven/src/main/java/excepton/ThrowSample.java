package excepton;

public class ThrowSample {

	public static void testThrow(int age)
	{
		if(age<18)
		{
		throw new ArithmeticException("not eligible");
		}
		else
		{
			System.out.println("eligible");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowSample.testThrow(17);
		System.out.println("statement");
	}

}
