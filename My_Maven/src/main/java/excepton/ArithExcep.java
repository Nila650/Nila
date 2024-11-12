package excepton;

public class ArithExcep {
	
	public static void main(String args[])
	{
		int a=10;
		int b=0;
		System.out.println("starting");
		
		try {
			
			int c=a/b;
		}
		catch(Exception e)
		{
			 b=5;
			int c=a/b;
			System.out.println(c);
			System.out.println(e);
		}
		finally
		{
			System.out.println("ending");
		}
		
	}
}
