package excepton;

public class ExceptionSample {

	public void test(int age) throws LicenseException
	{
		if(age<=18)
		{
			throw new LicenseException("not eligible");
		}
		else
		{
			System.out.println("eligible");
		}
	}

	public static void main(String[] args) throws LicenseException {
		// TODO Auto-generated method stub
		
		ExceptionSample ob=new ExceptionSample();
		ob.test(15);
		/*try {
			ob.test(15);
		} catch (LicenseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();*/
		}
}

