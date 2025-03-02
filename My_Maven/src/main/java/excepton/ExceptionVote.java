package excepton;

public class ExceptionVote {

	public void test(int age) throws VoteException
	{
		if(age<=18)
		{
			throw new VoteException("not eligible");
		}
		else
		{
			System.out.println("eligible");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
